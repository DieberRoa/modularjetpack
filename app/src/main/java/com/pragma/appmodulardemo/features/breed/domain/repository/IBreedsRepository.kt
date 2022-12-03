package com.pragma.appmodulardemo.features.breed.domain.repository

import com.pragma.appmodulardemo.features.breed.domain.models.Breed
import com.pragma.appmodulardemo.utils.Response
import kotlinx.coroutines.flow.Flow

interface IBreedsRepository {
    suspend fun getAllBreeds() : Flow<Response<List<Breed>>>
}