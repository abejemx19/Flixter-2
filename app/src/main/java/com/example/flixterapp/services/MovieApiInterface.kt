package com.example.flixterapp.services

import com.example.flixterapp.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=a07e22bc18f5cb106bfe4cc1f83ad8ed")
    fun getMovieList(): Call<MovieResponse>
}