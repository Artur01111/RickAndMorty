package com.example.rickandmorty.data.network.api

import com.example.rickandmorty.data.model.CharacterResponse
import com.example.rickandmorty.data.model.CharacterResultsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharacterApiService {

    @GET("character")
    suspend fun getAllCharacters(
        @Query("page") page: Int
    ): CharacterResultsResponse

    @GET("character/{id}")
    suspend fun getSingleCharacter(@Path("id") id: Int): Response<CharacterResponse>
}