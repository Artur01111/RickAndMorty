package com.example.rickandmorty.ui.screens.character.detail

import androidx.lifecycle.ViewModel
import com.example.rickandmorty.data.model.CharacterResponse
import com.example.rickandmorty.data.repository.CharacterRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class DetailCharacterViewModel(
    private val characterRepository: CharacterRepository
) : ViewModel() {

    private val _singleCharacterStateFlow = MutableStateFlow<CharacterResponse?>(null)
    val singleCharacterStateFlow = _singleCharacterStateFlow.asStateFlow()

    suspend fun getSingleCharacter(id: Int) {
        val character = characterRepository.getSingleCharacter(id)
        character?.let {
            _singleCharacterStateFlow.value = character
        }
    }
}