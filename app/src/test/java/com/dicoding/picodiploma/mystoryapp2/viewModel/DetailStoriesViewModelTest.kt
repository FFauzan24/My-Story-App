package com.dicoding.picodiploma.mystoryapp2.viewModel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import com.dicoding.picodiploma.mystoryapp2.data.DispacherRule
import com.dicoding.picodiploma.mystoryapp2.data.FailedDetailTest
import com.dicoding.picodiploma.mystoryapp2.data.SuccessDetailTest
import com.dicoding.picodiploma.mystoryapp2.data.getOrAwaitValue
import com.dicoding.picodiploma.mystoryapp2.model.repository.DetailStoriesRepository
import com.dicoding.picodiploma.mystoryapp2.model.response.DetailResponse
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData
import com.dicoding.picodiploma.mystoryapp2.viewmodel.DetailViewModel
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


@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class DetailStoriesViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    val dispacherRule = DispacherRule()

    @Mock
    private lateinit var detailStoriesRepository: DetailStoriesRepository
    private lateinit var detailViewModel: DetailViewModel


    companion object{
        private const val EXIST_ID = "ID"
        private const val WRONG_ID = "WRONG ID"
    }

    @Before
    fun setUp(){
        detailViewModel = DetailViewModel(detailStoriesRepository)
    }

    @Test
    fun `Detail Stories return Success`(){
        val dummy = SuccessDetailTest()
        val expected = MutableLiveData<ResultData<DetailResponse>>()
        expected.value = ResultData.Success(dummy)

        `when`(detailStoriesRepository.getDetailStories(EXIST_ID)).thenReturn(expected)
        val actualValues = detailViewModel.getDetailStories(EXIST_ID).getOrAwaitValue()
        Mockito.verify(detailStoriesRepository).getDetailStories(EXIST_ID)

        assertNotNull(actualValues)
        assertTrue(actualValues is ResultData.Success)
        assertEquals((expected.value as ResultData.Success).data?.story, actualValues.data?.story)
    }

    @Test
    fun `Detail Stories return Failed`(){
        val dummy = FailedDetailTest()
        val expected = MutableLiveData<ResultData<DetailResponse>>()
        expected.value = ResultData.Error(data = dummy, code = 401)

        `when`(detailStoriesRepository.getDetailStories(WRONG_ID)).thenReturn(expected)
        val actualValues = detailViewModel.getDetailStories(WRONG_ID).getOrAwaitValue()
        Mockito.verify(detailStoriesRepository).getDetailStories(WRONG_ID)

        assertNotNull(actualValues)
        assertTrue(actualValues is ResultData.Error)
        assertEquals((expected.value as ResultData.Error).data?.message, actualValues.data?.message)
    }
}