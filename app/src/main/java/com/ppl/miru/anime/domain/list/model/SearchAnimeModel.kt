package com.ppl.miru.anime.domain.list.model

data class SearchAnimeModel(
    val id: String,
    val title: String,
    val image: String,
    val releaseDate: String?, // or null
    val subOrDub: String // "sub" or "dub"
)
