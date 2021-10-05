package com.dev2061.tictactoemvvm

import com.dev2061.tictactoemvvm.model.Player
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class BoardViewModelTest {

    private lateinit var vm: BoardViewModel

    @Before
    fun setup(){
        vm = BoardViewModel()
        vm.startGame()
    }

    @Test
    fun onBoardSquareClicked_ShouldChangePlayer() {
        //Arrange

        //Act
        vm.onBoardSquareClicked(1,0)
        //Assert
        Assert.assertEquals(Player.O, vm.squares["10"])
    }
}