package com.example.android.unscramble.ui.game

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
	// These variables use Delegated Properties to avoid exposing mutable live data
	// The private mutable variables can only be modified within the viewModel
	// The public immutable variables can be accessed calling the get function and returning
	// the
	private val _score = MutableLiveData(0)
	val score: LiveData<Int>
		get() = _score

	private val _currentWordCount = MutableLiveData(0)
	val currentWordCount: LiveData<Int>
		get() = _currentWordCount

	private val _currentScrambledWord = MutableLiveData <String>()
	val currentScrambledWord: LiveData<String>
		get() = _currentScrambledWord

	private var wordsList: MutableList<String> = mutableListOf()
	private lateinit var currentWord: String

	init {
		getNextWord()
	}

	/*
	* Re-initializes the game data to restart the game.
	*/
	fun reinitializeData() {
		_score.value = 0
		_currentWordCount.value = 0
		wordsList.clear()
		getNextWord()
	}

	/*
	* Updates currentWord and currentScrambledWord with the next word.
	* Also adds the current word to the list of used words.
	*/
	private fun getNextWord() {
		currentWord = allWordsList.random()
		val tempWord = currentWord.toCharArray()
		tempWord.shuffle()

		while (String(tempWord).equals(currentWord, false)) {
			tempWord.shuffle()
		}
		if (wordsList.contains(currentWord)) {
			getNextWord()
		} else {
			_currentScrambledWord.value = String(tempWord)
			_currentWordCount.value = (_currentWordCount.value)?.inc()
			wordsList.add(currentWord)
		}
	}

	/*
	* Returns true if the current word count is less than MAX_NO_OF_WORDS.
	* Updates the next word.
	*/
	fun nextWord(): Boolean {
		return if (_currentWordCount.value!! < MAX_NO_OF_WORDS) {
			getNextWord()
			true
		} else false
	}

	/*
	* Increases the score by the defined score increase value.
	*/
	private fun increaseScore() {
		_score.value = (_score.value)?.plus(SCORE_INCREASE)
	}

	/*
	* Returns true if the current word is equal to the user's word.
	* Also increases the score.
	*/
	fun isUserWordCorrect(playerWord: String): Boolean {
		if (playerWord.equals(currentWord, true)) {
			increaseScore()
			return true
		}
		return false
	}
}
