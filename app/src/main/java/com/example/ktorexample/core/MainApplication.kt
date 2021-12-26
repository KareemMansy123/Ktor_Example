package com.example.ktorexample.core

import androidx.activity.ComponentActivity
import com.example.ktorexample.data.remote.Config
import com.example.ktorexample.data.remote.interfaces.ApiService

open class MainApplication : ComponentActivity() {
     val service = Config().create()
}