package com.pragma.appmodulardemo.features.breed.utils

import com.pragma.appmodulardemo.features.breed.utils.Const.BREEDDETAIL_SCREEN
import com.pragma.appmodulardemo.features.breed.utils.Const.BREEDSLIST_SCREEN
import com.pragma.appmodulardemo.features.breed.utils.Const.DETAIL_ARG_BREED_ID

sealed class Route (val route: String) {
    object BreedsList: Route("$BREEDSLIST_SCREEN")
//    object Detail: Route("$BREEDDETAIL_SCREEN/{$DETAIL_ARG_BREED_ID}") {
//        fun createRoute(breedId: Int) = "$BREEDDETAIL_SCREEN/$breedId"
//    }
}