package com.dev2061.tictactoemvvm.model

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class BoardTest {

    lateinit var board: Board

    @Rule
    @JvmField
    var instantTaskExecutorRule = InstantTaskExecutorRule()

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

    @Test
    fun Verify_VerticalSquares_WhenAllTheSame() {
        //Arrange
        val square = Square(Player.X)
        board.squares[0][1] = square
        board.squares[1][1] = square
        board.squares[2][1] = square
        //Act
        val actualResult: Boolean = board.checkIfSquaresIdenticalInColumn()
        //Assert
        Assert.assertTrue(actualResult)
    }

    @Test
    fun Verify_HorizontalSquares_WhenAllTheSame() {
        //Arrange
        val square = Square(Player.X)
        board.squares[0][0] = square
        board.squares[0][1] = square
        board.squares[0][2] = square
        //Act
        val actualResult: Boolean = board.checkIfSquaresIdenticalInRow()
        //Assert
        Assert.assertTrue(actualResult)
    }

    @Test
    fun Verify_DiagonalSquares_WhenAllTheSame() {
        //Arrange
        val square = Square(Player.X)
        board.squares[0][0] = square
        board.squares[1][1] = square
        board.squares[2][2] = square
        //Act
        val actualResult = board.checkIfSquaresIdenticalDiagonal()
        //Assert
        Assert.assertTrue(actualResult)
    }

    @Test
    fun Verify_HorizontalWinner() {
        //Arrange
        val square = Square(Player.X)
        board.squares[1][0] = square
        board.squares[1][1] = square
        board.squares[1][2] = square
        //Act
        val actualResult = board.checkEndGame()
        //Assert
        Assert.assertTrue(actualResult)
    }

    @Test
    fun Verify_VerticalWinner() {
        //Arrange
        val square = Square(Player.X)
        board.squares[0][2] = square
        board.squares[1][2] = square
        board.squares[2][2] = square
        //Act
        val actualResult = board.checkEndGame()
        //Assert
        Assert.assertTrue(actualResult)
    }

    @Test
    fun Verify_DiagonalWinner() {
        //Arrange
        val square = Square(Player.X)
        board.squares[0][2] = square
        board.squares[1][1] = square
        board.squares[2][0] = square
        //Act
        val actualResult = board.checkEndGame()
        //Assert
        Assert.assertTrue(actualResult)
    }

    @Test
    fun Verify_BoardIsFull(){
        board.squares[0][0] = Square(Player.X)
        board.squares[1][0] = Square(Player.O)
        board.squares[2][0] = Square(Player.X)
        board.squares[0][1] = Square(Player.O)
        board.squares[1][1] = Square(Player.X)
        board.squares[2][1] = Square(Player.O)
        board.squares[0][2] = Square(Player.X)
        board.squares[1][2] = Square(Player.O)
        board.squares[2][2] = Square(Player.X)
        Assert.assertTrue(board.areAllSquaresFilledIn())
    }

    @Test
    fun Verify_BoardIsNotFull(){
        board.squares[0][0] = Square(Player.X)
        board.squares[1][0] = Square(Player.O)
        board.squares[2][0] = Square(Player.X)
        board.squares[0][1] = Square(Player.O)
        board.squares[1][1] = Square(Player.X)
        board.squares[2][1] = Square(Player.O)
        board.squares[0][2] = Square(Player.X)
        board.squares[1][2] = Square(Player.O)
        Assert.assertFalse(board.areAllSquaresFilledIn())
    }

}


