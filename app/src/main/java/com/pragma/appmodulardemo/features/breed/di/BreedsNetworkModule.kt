package com.pragma.appmodulardemo.features.breed.di

import com.pragma.appmodulardemo.features.breed.domain.repository.IBreedsRepository
import com.pragma.appmodulardemo.features.breed.network.repository.BreedsRepository
import com.pragma.appmodulardemo.features.breed.network.services.api.BreedsService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class BreedsNetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.thecatapi.com/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideBreedsService(
        retrofit: Retrofit
    ): BreedsService = retrofit.create(BreedsService::class.java)

    @Provides
    fun provideBreedsRepository(
        breedsService: BreedsService
    ): IBreedsRepository = BreedsRepository(breedsService = breedsService)

}