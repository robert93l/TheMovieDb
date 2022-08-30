package com.example.themoviedb

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = Constants.APIKEY,
        @Query("page") page: Int
    ): Call<GetMoviesResponse>


    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = Constants.APIKEY,
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = Constants.APIKEY,
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("/movie/now_playing")
    fun getNowPlayingtMovies(
        @Query("api_key") apiKey: String = Constants.APIKEY,
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}