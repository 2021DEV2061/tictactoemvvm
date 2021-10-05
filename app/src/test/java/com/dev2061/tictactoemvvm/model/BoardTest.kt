package com.dev2061.tictactoemvvm.model

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class BoardTest {

    lateinit var board: Board

    @Before
    fun setup() {
        board = Board()
    }

    @Test
    fun changePlayer() {
        //Arrange
        board.currentPlayer = Player.X
        //Act
        board.changePlayer()
        //Assert
        assertEquals(Player.O, board.currentPlayer)
    }
}


