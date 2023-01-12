package com.dicoding.picodiploma.mystoryapp2.data

import com.dicoding.picodiploma.mystoryapp2.model.response.UploadStoriesResponse

fun SuccessAddStoriesTest(): UploadStoriesResponse{
    return UploadStoriesResponse(
        error = false,
        message = "Story created successfully"
    )
}

fun FailedAddStoriesTest(): UploadStoriesResponse{
    return UploadStoriesResponse(
        error = false,
        message = "photo should be Readable"
    )
}