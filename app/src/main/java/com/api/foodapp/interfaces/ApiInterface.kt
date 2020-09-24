package com.api.foodapp.interfaces

import com.api.foodapp.models.responses.UserListResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("api/users")
    fun getUserList(@Query("page") page:String):Call<UserListResponse>
}