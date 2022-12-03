package com.pragma.appmodulardemo.features.breed.network.services.api

import com.pragma.appmodulardemo.features.breed.domain.models.BreedsResponse
import com.pragma.appmodulardemo.features.breed.domain.models.Operation
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class BreedsService @Inject constructor(private val api: IBreedsApiClient) {

    suspend fun getAllBreeds() : BreedsResponse {
        return withContext(Dispatchers.IO) {
            val response = api.getAllBreeds()
            response.body() ?: BreedsResponse(emptyList(), Operation("",""))
        }
    }
}