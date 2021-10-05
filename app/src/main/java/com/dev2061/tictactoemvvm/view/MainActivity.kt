package com.dev2061.tictactoemvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dev2061.tictactoemvvm.R
import com.dev2061.tictactoemvvm.databinding.ActivityMainBinding
import com.dev2061.tictactoemvvm.model.Player
import com.dev2061.tictactoemvvm.viewmodel.BoardViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var vm: BoardViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        vm = ViewModelProvider(this).get(BoardViewModel::class.java)
        vm.startGame()
        binding.vm = vm
        vm.getWinner().observe(this, Observer<Player> {
        })
    }
}