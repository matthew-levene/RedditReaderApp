package com.ml.redditreaderapp.network

import com.ml.redditreaderapp.domain.Response
import com.ml.redditreaderapp.network.NetworkConstants.GET_POSTS_ENDPOINT
import retrofit2.http.GET

interface RedditApi {

    @GET(GET_POSTS_ENDPOINT)
    fun getPosts(loadSize: Int) : Response
}