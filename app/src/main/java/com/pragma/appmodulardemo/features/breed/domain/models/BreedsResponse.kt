package com.pragma.appmodulardemo.features.breed.domain.models

import com.google.gson.annotations.SerializedName

data class BreedsResponse (
    @SerializedName("data") val data: List<Breed>
)
