package com.dicoding.picodiploma.mystoryapp2.data

import com.dicoding.picodiploma.mystoryapp2.model.response.DetailResponse
import com.dicoding.picodiploma.mystoryapp2.model.response.Story

fun SuccessDetailTest(): DetailResponse{
    val dataStory = Story(
        id = "id",
        name = "name",
        description = "description",
        photoUrl = "image.jpg",
        createdAt = "created"
    )
    return DetailResponse(
        error = false,
        message = "Story fetched successfully",
        story = dataStory
    )
}

fun FailedDetailTest(): DetailResponse{
    return DetailResponse(
        error = true,
        message = "Story not found"
    )
}