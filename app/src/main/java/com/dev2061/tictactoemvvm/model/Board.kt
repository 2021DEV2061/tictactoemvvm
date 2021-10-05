package com.dev2061.tictactoemvvm.model

class Board {
    var currentPlayer: Player? = Player.X

    fun changePlayer() {
        currentPlayer = if (currentPlayer == Player.X) Player.O else Player.X
    }

}