package cs.med.mtz.moises.lyricsfragment.api.dto

import cs.med.mtz.moises.lyricsfragment.domain.entity.Song


data class SongDTO(
    val title: String,
    val album: AlbumDTO,
    val artist: ArtistDTO
){
    fun toSong(): Song =
        Song(
            title = title,
            imageUrl = album.cover_medium,
            artist = artist.name

        )
}