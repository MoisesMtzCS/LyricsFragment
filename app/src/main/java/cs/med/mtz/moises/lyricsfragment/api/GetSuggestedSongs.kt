package cs.med.mtz.moises.lyricsfragment.api

import cs.med.mtz.moises.lyricsfragment.api.dto.SongDTO

data class GetSuggestedSongs(
    val data : List<SongDTO>
)