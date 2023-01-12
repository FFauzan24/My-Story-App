package com.dicoding.picodiploma.mystoryapp2.viewModel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import com.dicoding.picodiploma.mystoryapp2.data.FailedRegisterTest
import com.dicoding.picodiploma.mystoryapp2.data.SuccessRegisterTest
import com.dicoding.picodiploma.mystoryapp2.data.getOrAwaitValue
import com.dicoding.picodiploma.mystoryapp2.model.repository.RegisterRepository
import com.dicoding.picodiploma.mystoryapp2.model.response.RegisterResponse
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData
import com.dicoding.picodiploma.mystoryapp2.viewmodel.RegisterViewModel
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
class RegisterViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var registerRepository: RegisterRepository
    private lateinit var registerViewModel: RegisterViewModel
    companion object{
        private const val NAME = "Acenk090909"
        private const val EMAIL = "Acenkz090909@gmail.com"
        private const val EXIST_EMAIL = "acenkz123@gmail.com"
        private const val PASSWORD = "123456"
    }

    @Before
    fun setUp(){
        registerViewModel = RegisterViewModel(registerRepository)
    }

    @Test
    fun `Register return Result Success`(){
        val successResponse = SuccessRegisterTest()

        val expected = MutableLiveData<ResultData<RegisterResponse>>()
        expected.value = ResultData.Success(successResponse)

        `when`(
            registerRepository.userRegister(
                NAME,
                EMAIL,
                PASSWORD
            )
        ).thenReturn(expected)

        val actualResponse = registerViewModel.userRegister(
            NAME,
            EMAIL,
            PASSWORD
        ).getOrAwaitValue()

        Mockito.verify(registerRepository).userRegister(
            NAME,
            EMAIL,
            PASSWORD
        )
        Assert.assertNotNull(actualResponse)
        Assert.assertTrue(actualResponse is ResultData.Success)
        Assert.assertEquals(expected.value, actualResponse)

    }

    @Test
    fun `Register return Result Error`(){
        val failedResponse = FailedRegisterTest()

        val expected = MutableLiveData<ResultData<RegisterResponse>>()
        expected.value = ResultData.Error(code = 400, data = failedResponse)

        `when`(
            registerRepository.userRegister(
                NAME,
                EXIST_EMAIL,
                PASSWORD
            )
        ).thenReturn(expected)

        val actualResponse = registerViewModel.userRegister(
            NAME,
            EXIST_EMAIL,
            PASSWORD
        ).getOrAwaitValue()

        Mockito.verify(registerRepository).userRegister(
            NAME,
            EXIST_EMAIL,
            PASSWORD
        )
        Assert.assertNotNull(actualResponse)
        Assert.assertTrue(actualResponse is ResultData.Error)
        Assert.assertEquals((expected.value as ResultData.Error).data?.message, actualResponse.data?.message)

    }

}