package cs.med.mtz.moises.lyricsfragment.api

import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("suggest/{valueSong}")
    suspend fun getSuggestSongs(
        @Path("valueSong") value: String
    ):GetSuggestedSongs

    /**
     *
     */
    @GET("v1/{artist}/{song}")
    suspend fun getLyricSong(
        @Path("artist") artist: String,
        @Path("song") song: String
    ): GetLyricSong
}