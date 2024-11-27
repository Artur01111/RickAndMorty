package com.example.rickandmorty.ui.screens.character

import androidx.lifecycle.ViewModel
import com.example.rickandmorty.data.model.CharacterResponse
import com.example.rickandmorty.data.repository.CharacterRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CharacterViewModel(
    private val characterRepository: CharacterRepository
) : ViewModel() {

    private val _characterStateFlow = MutableStateFlow<List<CharacterResponse>>(emptyList())
    val characterStateFlow = _characterStateFlow.asStateFlow()

    suspend fun getAllCharacters() {
        val characters = characterRepository.getAllCharacter()
        characters?.let {
            _characterStateFlow.value = characters
        }
    }
}