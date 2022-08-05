package com.yahdi.recipeapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class RecipeData(
    val title: String,
    val imageUrl: String,
    val bahan: String,
    val cara: String,
): Parcelable
