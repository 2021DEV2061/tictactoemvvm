package com.dev2061.tictactoemvvm.model

class Board {

    var squares = Array<Array<Square?>>(BOARD_SIZE) { arrayOfNulls(size = BOARD_SIZE) }
    var currentPlayer: Player? = Player.X

    fun changePlayer() {
        currentPlayer = if (currentPlayer == Player.X) Player.O else Player.X
    }

    fun checkIfSquaresIdenticalInColumn(): Boolean {
        return false
    }

    fun checkIfSquaresIdenticalInRow(): Boolean {
        return false
    }

    fun checkIfSquaresIdenticalDiagonal(): Boolean {
        return false
    }

    companion object {
        private const val BOARD_SIZE = 3
    }
}