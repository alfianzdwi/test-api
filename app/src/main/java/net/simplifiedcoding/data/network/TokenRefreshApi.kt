package net.simplifiedcoding.data.network

import net.simplifiedcoding.data.responses.TokenResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface TokenRefreshApi : BaseApi {
    @FormUrlEncoded
    @POST("authentications")
    suspend fun refreshAccessToken(
        @Field("refreshToken") refreshToken: String?
    ): TokenResponse
}