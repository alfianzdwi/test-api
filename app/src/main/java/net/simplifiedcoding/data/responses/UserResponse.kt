package net.simplifiedcoding.data.network

import com.google.gson.annotations.SerializedName

data class UserResponse(

	@field:SerializedName("data")
	val data: UserData? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class UserData(
	@field:SerializedName("user")
	val user: User? = null
)

data class User(

	@field:SerializedName("contact")
	val contact: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("username")
	val username: String? = null
)
