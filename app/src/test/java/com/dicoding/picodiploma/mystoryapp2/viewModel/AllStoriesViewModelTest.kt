package com.dicoding.picodiploma.mystoryapp2.viewModel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.AsyncPagingDataDiffer
import androidx.paging.PagingData
import androidx.paging.PagingSource
import androidx.paging.PagingState
import androidx.recyclerview.widget.ListUpdateCallback
import com.dicoding.picodiploma.mystoryapp2.data.DispacherRule
import com.dicoding.picodiploma.mystoryapp2.data.SuccessAllStoriesTest
import com.dicoding.picodiploma.mystoryapp2.data.getOrAwaitValue
import com.dicoding.picodiploma.mystoryapp2.model.repository.AllStoryRepository
import com.dicoding.picodiploma.mystoryapp2.model.response.Story
import com.dicoding.picodiploma.mystoryapp2.ui.adapter.StoriesAdapter
import com.dicoding.picodiploma.mystoryapp2.viewmodel.StoriesViewModel
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
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
class AllStoriesViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    val dispacherRule = DispacherRule()

    @Mock
    private lateinit var allStoryRepository: AllStoryRepository
    private lateinit var allStoryViewModel: StoriesViewModel

    @Before
    fun setUp(){
        allStoryViewModel = StoriesViewModel(allStoryRepository)
    }

    @Test
    fun `AllStories return Data Stories`() = runTest {
        val dummy = SuccessAllStoriesTest()
        val paging = PageResource.snapshot(dummy)

        val expercted = MutableLiveData<PagingData<Story>>()
        expercted.value = paging

        `when`(allStoryRepository.showAllStories()).thenReturn(expercted)

        val actualValues: PagingData<Story> = allStoryViewModel.showAllStories().getOrAwaitValue()
        Mockito.verify(allStoryRepository).showAllStories()

        val differ = AsyncPagingDataDiffer(
            diffCallback = StoriesAdapter.DIFF_CALLBACK,
            updateCallback = noopListUpdateCallback,
            workerDispatcher = Dispatchers.Main
        )

        differ.submitData(actualValues)

        assertNotNull(differ.snapshot())
        assertEquals(dummy.size, differ.snapshot().size)
        assertEquals(dummy, differ.snapshot())
        assertEquals(dummy[0], differ.snapshot()[0])
    }

    @Test
    fun `AllStories return Data Empty`() = runTest {
        val dummy = SuccessAllStoriesTest()
        val response = arrayListOf<Story>()
        val paging = PageResource.snapshot(response)


        val expected = MutableLiveData<PagingData<Story>>()
        expected.value = paging

        `when`(allStoryRepository.showAllStories()).thenReturn(expected)

        val actualValues = allStoryRepository.showAllStories().getOrAwaitValue()
        Mockito.verify(allStoryRepository).showAllStories()

        val differ = AsyncPagingDataDiffer(
            diffCallback = StoriesAdapter.DIFF_CALLBACK,
            updateCallback = noopListUpdateCallback,
            workerDispatcher = Dispatchers.Main
        )

        differ.submitData(actualValues)
        assertTrue(differ.snapshot().isEmpty())
        assertNotEquals(dummy, differ.snapshot())

    }



    val noopListUpdateCallback = object : ListUpdateCallback{
        override fun onInserted(position: Int, count: Int) {
        }

        override fun onRemoved(position: Int, count: Int) {
        }

        override fun onMoved(fromPosition: Int, toPosition: Int) {
        }

        override fun onChanged(position: Int, count: Int, payload: Any?) {
        }

    }
}