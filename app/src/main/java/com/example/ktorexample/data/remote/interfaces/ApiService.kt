package com.example.ktorexample.data.remote.interfaces

import com.example.ktorexample.data.remote.entites.PostEntityItem

interface ApiService {
    suspend fun getPosts() : List<PostEntityItem>
}