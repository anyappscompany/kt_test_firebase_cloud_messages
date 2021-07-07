package com.jelvix.kt_test_firebase_cloud_messages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        Log.d("debapp", intent.getExtras()?.getString("custom_key_1").toString())
    }
}