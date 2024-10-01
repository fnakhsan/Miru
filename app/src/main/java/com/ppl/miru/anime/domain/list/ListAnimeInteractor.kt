package com.ppl.miru.anime.domain.list

import androidx.paging.PagingData
import com.ppl.miru.anime.domain.list.model.LastUpdateAnimeModel
import com.ppl.miru.anime.domain.list.model.SearchAnimeModel
import com.ppl.miru.anime.domain.list.model.TopAirAnimeModel
import kotlinx.coroutines.flow.Flow

class ListAnimeInteractor(private val listAnimeRepository: ListAnimeRepository) :
    ListAnimeUseCase {

    override fun searchAnime(query: String): Flow<PagingData<SearchAnimeModel>> {
        return listAnimeRepository.searchAnime(query)
    }

    override fun getLastUpdateAnime(): Flow<PagingData<LastUpdateAnimeModel>> {
        return listAnimeRepository.getLastUpdateAnime()
    }

    override fun getTopAiringAnime(): Flow<PagingData<TopAirAnimeModel>> {
        return listAnimeRepository.getTopAiringAnime()
    }
}