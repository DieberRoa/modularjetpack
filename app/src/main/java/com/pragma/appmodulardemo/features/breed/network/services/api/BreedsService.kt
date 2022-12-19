package com.pragma.appmodulardemo.features.breed.network.services.api

import com.pragma.appmodulardemo.features.breed.domain.models.BreedsResponse
import com.pragma.appmodulardemo.features.breed.utils.Const.API_KEY
import retrofit2.http.GET
import retrofit2.http.Headers

interface BreedsService {

    @Headers("x-api-key:$API_KEY")
    @GET("breeds")
    suspend fun getAllBreeds() : BreedsResponse

}