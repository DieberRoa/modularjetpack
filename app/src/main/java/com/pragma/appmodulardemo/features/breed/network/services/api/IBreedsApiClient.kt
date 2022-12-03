package com.pragma.appmodulardemo.features.breed.network.services.api

import com.pragma.appmodulardemo.features.breed.domain.models.BreedsResponse
import retrofit2.Response
import retrofit2.http.GET

interface IBreedsApiClient {

    @GET("breeds")
    suspend fun getAllBreeds() : Response<BreedsResponse>

}