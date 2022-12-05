package com.pragma.appmodulardemo.features.breed.network.repository

import com.pragma.appmodulardemo.features.breed.domain.models.Breed
import com.pragma.appmodulardemo.features.breed.domain.repository.IBreedsRepository
import com.pragma.appmodulardemo.features.breed.network.services.api.BreedsService
import com.pragma.appmodulardemo.utils.Response
import dagger.Binds
import dagger.Provides
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BreedsRepository @Inject constructor(
    private val breedsService : BreedsService,
): IBreedsRepository {

    override suspend fun getAllBreeds() : Flow<Response<List<Breed>>> =
        flow {
            try{
                emit(Response.Loading)
                val responseApi = breedsService.getAllBreeds().data
                emit(Response.Success(responseApi))
            } catch (e: java.lang.Exception) {
                emit(Response.Failure(e))
            }
        }.flowOn(Dispatchers.IO)

}