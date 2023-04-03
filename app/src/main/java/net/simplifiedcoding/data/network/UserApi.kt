package net.simplifiedcoding.data.network


import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface UserApi : BaseApi{
    @GET("users/{id}")
    suspend fun getUser(@Path("id") id: String,): UserResponse

}