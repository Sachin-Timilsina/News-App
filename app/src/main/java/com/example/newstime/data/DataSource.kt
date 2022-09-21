package com.example.newstime.data

import com.example.newstime.R
import com.example.newstime.model.Model


class DataSource {
    fun loadContents():List<Model> {
        return listOf<Model>(
            Model(R.string.hd_chicken,R.drawable.chicken),
            Model(R.string.hd_bitcoin,R.drawable.bitcoin),
            Model(R.string.hd_junk_food,R.drawable.junkfood),
            Model(R.string.hd_sports,R.drawable.sports),
            Model(R.string.hd_green_energy,R.drawable.greenenergy),
            Model(R.string.hd_stocks,R.drawable.stocks),
            Model(R.string.hd_yoga,R.drawable.yoga)
        )
    }
}
