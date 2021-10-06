# TicTacToe Android:
This is a Kotlin based implementation for a TicTacToe game by using MVVM and databinding.

# Rules
X always goes first.
Players cannot play on a played position.
Players alternate placing X’s and O’s on the board until either:
One player has three in a row, horizontally, vertically or diagonally
All nine squares are filled.
If a player is able to draw three X’s or three O’s in a row, that player wins.
If all nine squares are filled and neither player has three in a row, the game is a draw.

# Repo
The Github repo can be found at: https://github.com/2021DEV2061/tictactoemvvm

# Prerequisites
Android Emulator / Physical Device with preferably Android OS version between 8 and 11.

# How to run the app
After cloning the repo and opening the project in Android Studio, you can run the app by clicking the button "Run 'app'" in the toolbar.

# How to run the tests
For running the tests, please navigate to following project directory:
    - For Unit tests:
        *app/src/test/java/com/dev2061/tictactoemvvm/model/BoardTest.kt*
        *app/src/test/java/com/dev2061/tictactoemvvm/viewmodel/BoardViewModelTest.kt*

        The Unit tests can be run by clicking on the left of the Test method name on the run button

    - For UI Espresso tests:
        *app/src/androidTest/java/com/dev2061/tictactoemvvm/MainActivityTest.kt*

        The Ui tests can be run by editing the configuration to the chosen Test of the file and followed by clicking on the run button (green triangle) in the toolbar


# Technologies used:
    - In my project I used the following Lifecycle components:
        - Lifecycle viewModel
        - Lifecycle LiveData
      Android Jetpack Lifecycle: Lifecycle-aware components perform actions in response to a change in the lifecycle status of another component,
      such as activities and fragments. These components help you produce better-organized, and often lighter-weight code, that is easier to maintain.

    - Jetpack Data Binding: The Data Binding Library is a support library that allows you to bind UI components in your layouts to data sources
      in your app using a declarative format rather than programmatically.

    - Unit tests: Junit4
    - UI tests: Espresso

# Possible improvements
    - Improve the layout
    - Have more test coverage.
    - Use TDD for UI tests
    - New requirements for game:
        - Dynamic player input
        - Option for starting with symbol of chose (Nought or Cross)
        - Keep track of score
        - ...



