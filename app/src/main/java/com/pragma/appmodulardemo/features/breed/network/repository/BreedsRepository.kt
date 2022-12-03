package com.pragma.appmodulardemo.features.breed.network.repository

import com.pragma.appmodulardemo.features.breed.domain.models.Breed
import com.pragma.appmodulardemo.features.breed.domain.repository.IBreedsRepository
import com.pragma.appmodulardemo.features.breed.network.services.api.BreedsService
import com.pragma.appmodulardemo.utils.Response
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class BreedsRepository @Inject constructor(
    private val service: BreedsService,
): IBreedsRepository {

    override suspend fun getAllBreeds() : Flow<Response<List<Breed>>> =
        flow {
            try{
                emit(Response.Loading)
                val responseApi = service.getAllBreeds().data;
                emit(Response.Success(responseApi))
            } catch (e: java.lang.Exception) {
                emit(Response.Failure(e))
            }
        }.flowOn(Dispatchers.IO)

}