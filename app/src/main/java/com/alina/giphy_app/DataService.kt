package com.alina.giphy_app

import retrofit2.Call
import retrofit2.http.GET

interface DataService {

    @GET("gifs/trending?api_key=7pSp58Kv9xxC7Ze8sbrgavjGDaNy7u7f")
    fun getGifs(): retrofit2.Call<DataResult>
}