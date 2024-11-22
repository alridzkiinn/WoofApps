package com.example.nim234311031.woofapps

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class DataAnjing(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    DataAnjing(R.drawable._5, R.string.dog_name_1, 4, R.string.description_1),
    DataAnjing(R.drawable._6, R.string.dog_name_2, 5, R.string.description_2),
    DataAnjing(R.drawable._7, R.string.dog_name_3, 4, R.string.description_3),
    DataAnjing(R.drawable._8, R.string.dog_name_4, 3, R.string.descripsi4),
    DataAnjing(R.drawable._0, R.string.dog_name_5, 2, R.string.descripsi5),
    DataAnjing(R.drawable._9, R.string.dog_name_6, 4, R.string.descripsi6),

    )