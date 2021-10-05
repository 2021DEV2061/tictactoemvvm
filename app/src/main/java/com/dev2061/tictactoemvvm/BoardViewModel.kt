package com.dev2061.tictactoemvvm

import androidx.databinding.ObservableArrayMap
import androidx.lifecycle.ViewModel
import com.dev2061.tictactoemvvm.model.Board

class BoardViewModel : ViewModel() {

    lateinit var squares: ObservableArrayMap<String, String>
    lateinit var board: Board

    fun startGame() {
        squares = ObservableArrayMap()
        board = Board()
    }

    fun onBoardSquareClicked(row: Int, column: Int) {
    }
}