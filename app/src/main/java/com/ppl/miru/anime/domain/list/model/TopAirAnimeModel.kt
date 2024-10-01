package com.ppl.miru.anime.domain.list.model

data class TopAirAnimeModel(
    val id: String,
    val image: String,
    val title: String,
    val genres: List<String>
)