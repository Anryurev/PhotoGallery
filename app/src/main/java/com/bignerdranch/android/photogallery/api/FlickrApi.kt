package com.bignerdranch.android.photogallery.api

import com.bignerdranch.android.photogallery.FlickrResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface FlickrApi {
    @GET("services/rest/? method=flickr.interestingness.getList" + "&api_key=e84a44be958b350c8aaaccea7d2c3f8e" + "&format=json" + "&nojsoncallback=1" + "&extras=url_s")
    fun fetchPhotos(): Call<FlickrResponse>
    @GET
    fun fetchUrlBytes(@Url url: String): Call<ResponseBody>
}