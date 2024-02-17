package com.example.unscramble_game.ui

data class GameUiState(
    val currentScrambledWord: String = "",
    val currentWordCount: Int = 1,
    val score: Int = 0,
    val isGuessedWordWrong: Boolean = false,
    val isGameOver: Boolean = false,
    val hintRequestAccepted: Boolean = false,
    val outOfHints: Boolean = false
)
