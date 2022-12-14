package com.kproject.memesappai

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MemeViewModel(private val memeRepository: MemeRepository) : ViewModel() {
    val memes = MutableLiveData<List<Meme>>()

    fun getMemes() {
        viewModelScope.launch {
            memes.value = memeRepository.getMemes()
        }
    }

    class ViewModelFactory<T : ViewModel> : ViewModelProvider.Factory {
        private var viewModel: T? = null

        constructor(viewModel: T) {
            this.viewModel = viewModel
        }

        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return viewModel as T
        }
    }
}