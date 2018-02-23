package eu.laramartin.rxjavaplayground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import io.reactivex.Observable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Check the RxJavaTest for simple examples

        Observable.just(42)
                .subscribe { log(it) }

    }

    private fun log(it: Any) {
        Log.d("RxJava", "Log: $it")
    }
}
