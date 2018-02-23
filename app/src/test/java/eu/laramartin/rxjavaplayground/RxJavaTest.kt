package eu.laramartin.rxjavaplayground

import io.reactivex.Observable
import junit.framework.Assert.assertEquals
import org.junit.Test

// Run me!
class RxJavaTest {

    @Test
    fun `simple observable print`() {
        // Look at the test output
        Observable.just(42).subscribe { print(it) }
    }

    @Test
    fun `simple observable with test`() {
        // How to test in RxJava2
        val test = Observable.just(42).test()

        // Use "values" to get all the observed values
        assertEquals(42, test.values()[0])
    }

    @Test
    fun `data transformation`() {
        Observable.just(5, 6, 7)
                .map { ";-) ".repeat(it) }
                .subscribe { println(it)}
    }
}