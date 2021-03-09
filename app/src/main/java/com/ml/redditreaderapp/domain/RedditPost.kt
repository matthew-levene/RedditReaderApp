package com.ml.redditreaderapp.domain

import com.google.gson.annotations.SerializedName

data class RedditPost(
    val author : String,
    val title : String
)