package cs.med.mtz.moises.lyricsfragment.retrofit

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cs.med.mtz.moises.lyricsfragment.api.ApiService
import cs.med.mtz.moises.lyricsfragment.domain.entity.Song
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SongsViewModel : ViewModel() {
    private val service: ApiService = retrofit.create<ApiService>(ApiService::class.java)

    /* */
    private val songsMutableLiveData: MutableLiveData<List<Song>> = MutableLiveData()
    val songsLiveData: LiveData<List<Song>> get() = songsMutableLiveData

    fun executeLoadSongs() {
        viewModelScope.launch(Dispatchers.IO) {
        }


    }
}