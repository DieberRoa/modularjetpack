package com.pragma.appmodulardemo.features.breed.domain.models
import com.google.gson.annotations.SerializedName

data class Operation(
    @SerializedName("code") val code: String,
    @SerializedName("description") val description: String
)
