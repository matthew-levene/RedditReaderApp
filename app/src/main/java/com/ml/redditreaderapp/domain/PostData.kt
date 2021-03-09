package com.ml.redditreaderapp.domain

import com.google.gson.annotations.SerializedName

data class PostData(
    @SerializedName("author") val author : String,
    @SerializedName("title") val title : String
)

fun PostData.toRedditPost() =
    RedditPost(this.author, this.title)