package com.dev2061.tictactoemvvm.model

class Board {

    var squares = Array<Array<Square?>>(BOARD_SIZE) { arrayOfNulls(size = BOARD_SIZE) }
    var currentPlayer: Player? = Player.X

    fun changePlayer() {
        currentPlayer = if (currentPlayer == Player.X) Player.O else Player.X
    }

    companion object {
        private const val BOARD_SIZE = 3
    }
}