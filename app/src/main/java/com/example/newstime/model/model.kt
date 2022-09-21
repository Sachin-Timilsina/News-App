package com.example.newstime.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Model(
    @StringRes val stringResourceId: Int,
    @DrawableRes val drawableResourceId: Int) {

}
