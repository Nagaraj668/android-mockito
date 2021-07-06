package com.srjons.mockito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity(), SamplePresenter.View {

    val samplePresenter: SamplePresenter = SamplePresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        samplePresenter.attachView(this)
    }

    override fun isDestroyed(): Boolean {
        samplePresenter.detachView()
        return super.isDestroyed()
    }

    override fun checkStringResult(result: Boolean) {
        if (result) {
            Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "false", Toast.LENGTH_SHORT).show()
        }
    }
}
