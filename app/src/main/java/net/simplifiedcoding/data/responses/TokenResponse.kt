package net.simplifiedcoding.data.responses

data class TokenResponse(
    val accessToken: String?,
    val refreshToken: String?,
)