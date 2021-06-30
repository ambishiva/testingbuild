package com.test.testingbuild

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCenter.start(
            application, "1b7d5ec8-6c4a-4af7-8a2b-204939ace628",
            Analytics::class.java, Crashes::class.java
        )
        Toast.makeText(this,"added test branch",Toast.LENGTH_SHORT).show()
    }
}