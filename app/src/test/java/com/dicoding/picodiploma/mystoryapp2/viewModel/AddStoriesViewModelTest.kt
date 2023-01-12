package com.dicoding.picodiploma.mystoryapp2.viewModel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import com.dicoding.picodiploma.mystoryapp2.data.DispacherRule
import com.dicoding.picodiploma.mystoryapp2.data.FailedAddStoriesTest
import com.dicoding.picodiploma.mystoryapp2.data.SuccessAddStoriesTest
import com.dicoding.picodiploma.mystoryapp2.data.getOrAwaitValue
import com.dicoding.picodiploma.mystoryapp2.model.repository.AddStoriesRepository
import com.dicoding.picodiploma.mystoryapp2.model.response.UploadStoriesResponse
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData
import com.dicoding.picodiploma.mystoryapp2.viewmodel.AddStoryViewModel
import junit.framework.Assert.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner
import java.io.File


@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class AddStoriesViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    val dispacherRule = DispacherRule()

    @Mock
    private lateinit var addStoriesRepository: AddStoriesRepository
    private lateinit var addStoryViewModel: AddStoryViewModel

    @Mock
    private lateinit var file: File
    companion object{
        private val desc = "desc"
    }

    @Before
    fun setUp(){
        addStoryViewModel = AddStoryViewModel(addStoriesRepository)
    }

    @Test
    fun `AddStories return Result Success`(){
        val dummy = SuccessAddStoriesTest()

        val expected = MutableLiveData<ResultData<UploadStoriesResponse>>()
        expected.value = ResultData.Success(dummy)

        `when`(addStoriesRepository.addStory(desc, file)).thenReturn(expected)

        val actualValues = addStoryViewModel.addStory(desc, file).getOrAwaitValue()
        Mockito.verify(addStoriesRepository).addStory(desc, file)

        assertNotNull(actualValues)
        assertTrue(actualValues is ResultData.Success)
        assertEquals((expected.value as ResultData.Success).data, actualValues.data)
    }

    @Test
    fun `AddStories return Result Failed`(){
        val dummy = FailedAddStoriesTest()

        val expected = MutableLiveData<ResultData<UploadStoriesResponse>>()
        expected.value = ResultData.Error(data = dummy, code = 400)

        `when`(addStoriesRepository.addStory(desc, file)).thenReturn(expected)

        val actualValues = addStoryViewModel.addStory(desc, file).getOrAwaitValue()
        Mockito.verify(addStoriesRepository).addStory(desc, file)

        assertNotNull(actualValues)
        assertTrue(actualValues is ResultData.Error)
        assertEquals((expected.value as ResultData.Error).data?.message, actualValues.data?.message)
    }
}