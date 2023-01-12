package com.dicoding.picodiploma.mystoryapp2.viewModel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import com.dicoding.picodiploma.mystoryapp2.data.FailedLoginTest
import com.dicoding.picodiploma.mystoryapp2.data.SuccessLoginTest
import com.dicoding.picodiploma.mystoryapp2.data.getOrAwaitValue
import com.dicoding.picodiploma.mystoryapp2.model.repository.LoginRepository
import com.dicoding.picodiploma.mystoryapp2.model.response.LoginStoriesResponse
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData
import com.dicoding.picodiploma.mystoryapp2.viewmodel.LoginViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Assert.*
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
class LoginViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var loginRepository: LoginRepository
    private lateinit var loginViewModel: LoginViewModel
    companion object{
        private const val LOGIN_EMAIL = "acenkz123@gmail.com"
        private const val PASSWORD = "12345678"
        private const val WRONG_PASSWORD = "123456"
    }

    @Before
    fun setUp(){
        loginViewModel = LoginViewModel(loginRepository)
    }

    @Test
    fun `Login return Result Success`(){
        val successResponse = SuccessLoginTest()

        val expected = MutableLiveData<ResultData<LoginStoriesResponse>>()
        expected.value = ResultData.Success(data = successResponse)

        `when`(loginRepository.userLogin(LOGIN_EMAIL, PASSWORD)).thenReturn(expected)

        val actualResponse = loginViewModel.userLogin(LOGIN_EMAIL, PASSWORD).getOrAwaitValue()

        Mockito.verify(loginRepository).userLogin(LOGIN_EMAIL, PASSWORD)
        assertNotNull(actualResponse)
        assertTrue(actualResponse is ResultData.Success)
        assertEquals(expected.value, actualResponse)

    }

    @Test
    fun `Login Return Result Error`(){
        val ErrorResponse = FailedLoginTest()

        val expected = MutableLiveData<ResultData<LoginStoriesResponse>>()
        expected.value = ResultData.Error(code = 401, data = ErrorResponse)

        `when`(loginRepository.userLogin(LOGIN_EMAIL, WRONG_PASSWORD)).thenReturn(expected)

        val actualResponse = loginViewModel.userLogin(LOGIN_EMAIL, WRONG_PASSWORD).getOrAwaitValue()
        Mockito.verify(loginRepository).userLogin(LOGIN_EMAIL, WRONG_PASSWORD)

        assertNotNull(actualResponse)
        assertTrue(actualResponse is ResultData.Error)
        assertEquals((expected.value as ResultData.Error).data?.message, actualResponse.data?.message)

    }
}