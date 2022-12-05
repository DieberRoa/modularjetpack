package com.pragma.appmodulardemo.features.breed.network.services.api

import com.pragma.appmodulardemo.features.breed.domain.models.BreedsResponse
import com.pragma.appmodulardemo.features.breed.domain.models.Operation
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.http.GET
import javax.inject.Inject

interface BreedsService {

    @GET("breeds")
    suspend fun getAllBreeds() : BreedsResponse

}