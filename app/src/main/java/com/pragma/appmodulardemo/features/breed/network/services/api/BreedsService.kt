package com.pragma.appmodulardemo.features.breed.network.services.api

import com.pragma.appmodulardemo.features.breed.domain.models.BreedsResponse
import com.pragma.appmodulardemo.features.breed.domain.models.Operation
import com.pragma.appmodulardemo.features.breed.utils.Const.API_KEY
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import javax.inject.Inject

interface BreedsService {

    @Headers("x-api-key:$API_KEY")
    @GET("breeds")
    suspend fun getAllBreeds() : BreedsResponse

}