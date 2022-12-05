package com.pragma.democatbreed.features.breeds.fragment.breed

import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.pragma.appmodulardemo.features.breed.fragment.breed.screen.BreedsScreen
import com.pragma.appmodulardemo.features.breed.viewmodel.BreedsViewModel
import com.pragma.appmodulardemo.utils.Response


@Composable
fun BreedsFragment(
    breedsViewModel: BreedsViewModel = hiltViewModel()
) {

    fun launch() {
        breedsViewModel.getAllBreeds()
    }

    launch()
    Surface {
        when(val breedsListResponse = breedsViewModel.breedsState.value) {
            is Response.Loading -> {
                CircularProgressIndicator()
            }
            is Response.Success -> {
                BreedsScreen(
                    breedsList = breedsListResponse.data
                )
            }

        }
    }

}