package com.dicoding.picodiploma.mystoryapp2.viewModel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import com.dicoding.picodiploma.mystoryapp2.data.DispacherRule
import com.dicoding.picodiploma.mystoryapp2.data.FailedLocationTest
import com.dicoding.picodiploma.mystoryapp2.data.SuccessLocationTest
import com.dicoding.picodiploma.mystoryapp2.data.getOrAwaitValue
import com.dicoding.picodiploma.mystoryapp2.model.repository.MapsRepository
import com.dicoding.picodiploma.mystoryapp2.model.response.StoriesResponse
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData
import com.dicoding.picodiploma.mystoryapp2.viewmodel.MapsViewModel
import junit.framework.TestCase.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Assert
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
class MapsViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    val dispacherRule = DispacherRule()

    @Mock
    private lateinit var mapsRepository: MapsRepository
    private lateinit var mapsViewModel: MapsViewModel

    @Before
    fun setUp(){
        mapsViewModel = MapsViewModel(mapsRepository)
    }

    @Test
    fun `AllStories with lat lon return Success`(){
        val dummy = SuccessLocationTest()
        val expected = MutableLiveData<ResultData<StoriesResponse>>()
        expected.value = ResultData.Success(dummy)

        `when`(mapsRepository.getStoriesLocation()).thenReturn(expected)

        val actualValues = mapsViewModel.getStoriesLocation().getOrAwaitValue()
        Mockito.verify(mapsRepository).getStoriesLocation()

        assertNotNull(actualValues)
        assertTrue(actualValues is ResultData.Success)
        assertNotNull(actualValues.data?.listStory?.get(0)?.lat)
        assertNotNull(actualValues.data?.listStory?.get(0)?.lon)
        assertEquals((expected.value as ResultData.Success).data, actualValues.data)

    }

    @Test
    fun `AllStories with lat lon return Failed`(){
        val dummy = FailedLocationTest()
        val expected = MutableLiveData<ResultData<StoriesResponse>>()
        expected.value = ResultData.Error(data = dummy, code = null)

        `when`(mapsRepository.getStoriesLocation()).thenReturn(expected)

        val actualValues = mapsViewModel.getStoriesLocation().getOrAwaitValue()
        Mockito.verify(mapsRepository).getStoriesLocation()

        assertNotNull(actualValues)
        assertTrue(actualValues is ResultData.Error)
        Assert.assertNull(actualValues.data?.listStory?.get(0)?.lat)
        Assert.assertNull(actualValues.data?.listStory?.get(0)?.lon)
    }
}