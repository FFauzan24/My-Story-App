package com.dicoding.picodiploma.mystoryapp2.data

import com.dicoding.picodiploma.mystoryapp2.model.response.StoriesResponse
import com.dicoding.picodiploma.mystoryapp2.model.response.Story
import java.util.*

fun SuccessLocationTest(): StoriesResponse{
    val stories = LinkedList<Story>()

    for (i in 1..10){
        val story = Story(
            id = "id++$i",
            name = "name++$i",
            description = "description++$i",
            photoUrl = "photo++$i.jpg",
            createdAt = "created++$i",
            lat = -6.97583 + i,
            lon = 108.48306 + i
        )
        stories.add(story)
    }
    return StoriesResponse(
        error = false,
        message = "Stories fetched successfully",
        listStory = stories
    )
}

fun FailedLocationTest(): StoriesResponse{
    return StoriesResponse(
        error = true,
        message = "Missing authentication",
        listStory = null
    )
}
