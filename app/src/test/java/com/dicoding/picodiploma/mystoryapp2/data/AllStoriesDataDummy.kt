package com.dicoding.picodiploma.mystoryapp2.data

import com.dicoding.picodiploma.mystoryapp2.model.response.Story

fun SuccessAllStoriesTest(): List<Story>{
    val listStory: MutableList<Story> = arrayListOf()
    for (i in 1..5){
        val story = Story(
            id = "id++$i",
            name = "name++$i",
            description = "description+=$i",
            photoUrl = "photo++$i.jpg",
            createdAt = "created++$i"
        )
        listStory.add(story)
    }
    return listStory
}