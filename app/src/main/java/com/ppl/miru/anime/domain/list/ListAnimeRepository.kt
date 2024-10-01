package com.ppl.miru.anime.domain.list

import androidx.paging.PagingData
import com.ppl.miru.anime.domain.list.model.LastUpdateAnimeModel
import com.ppl.miru.anime.domain.list.model.SearchAnimeModel
import com.ppl.miru.anime.domain.list.model.TopAirAnimeModel
import kotlinx.coroutines.flow.Flow

interface ListAnimeRepository {
    fun searchAnime(query: String): Flow<PagingData<SearchAnimeModel>>

    fun getLastUpdateAnime(): Flow<PagingData<LastUpdateAnimeModel>>

    fun getTopAiringAnime(): Flow<PagingData<TopAirAnimeModel>>
}