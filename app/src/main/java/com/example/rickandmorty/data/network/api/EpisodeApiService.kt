package com.example.rickandmorty.data.network.api

import com.example.rickandmorty.data.model.EpisodeResponse
import com.example.rickandmorty.data.model.EpisodeResultResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface EpisodeApiService {

    @GET("episode")
    suspend fun getAllEpisodes(): Response<EpisodeResultResponse>

    @GET("episode/{id}")
    suspend fun getSingleEpisode(@Path("id") id: Int): Response<EpisodeResponse>
}