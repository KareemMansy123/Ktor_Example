package com.example.ktorexample.data.remote

import com.example.ktorexample.data.remote.interfaces.ApiService
import com.example.ktorexample.data.remote.entites.PostEntityItem
import io.ktor.client.*

class PostsServiceImpl(
    private val client : HttpClient
) : ApiService {
    override suspend fun getPosts(): List<PostEntityItem> {
        return handler(Routes.Posts.url,client = client)
    }
}