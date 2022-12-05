package com.pragma.appmodulardemo.features.breed.fragment.breed.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.pragma.appmodulardemo.features.breed.domain.models.Breed

@Composable
fun BreedsScreen(
    breedsList: List<Breed>? = null
) {
    if (breedsList == null) return
    LazyColumn {
        items(breedsList.count()) { item ->
            breedsList[item].let { breed ->
                Card {
                    breed.name?.let { Text(it) }
                }
            }
        }
    }
}


