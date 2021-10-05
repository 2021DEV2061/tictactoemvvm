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
        val appendedString = appendString(row, column)
        squares[appendedString] = board.currentPlayer?.name

        board.changePlayer()
    }
}

//With this function all the input digits are being appended into 1 string
fun appendString(vararg digits: Int) = digits.joinTo(StringBuilder(), separator = "").toString()