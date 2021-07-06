package com.srjons.mockito

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private lateinit var presenter: SamplePresenter
    private lateinit var view: SamplePresenter.View

    @Before
    fun setup() {
        presenter = SamplePresenter()
        view = mock()
        presenter.attachView(view)
    }


    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    @Test
    fun firstMockitoTest() {
        presenter.checkString("Nagaraj")
        verify(view).checkStringResult(false)
    }
}