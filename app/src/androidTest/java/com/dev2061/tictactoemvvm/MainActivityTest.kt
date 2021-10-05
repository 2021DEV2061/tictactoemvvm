package com.dev2061.tictactoemvvm

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dev2061.tictactoemvvm.view.MainActivity
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @Rule
    @JvmField
    var activityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkBoardAndSquaresShown() {

        onView(withId(R.id.grid_id)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.s00)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.s01)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.s02)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.s10)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.s11)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.s12)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.s20)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.s21)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.s22)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun checkWinnerDiagonal() {

        onView(withId(R.id.s02)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s12)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s11)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s22)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s20)).perform(ViewActions.click())

        onView(ViewMatchers.withText("X won"))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun checkWinnerVertical() {

        onView(withId(R.id.s00)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s01)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s10)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s11)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s20)).perform(ViewActions.click())

        onView(ViewMatchers.withText("X won"))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun checkWinnerHorizontal() {

        onView(withId(R.id.s00)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s10)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s20)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s11)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s22)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s12)).perform(ViewActions.click())

        onView(ViewMatchers.withText("O won"))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun checkDraw() {

        onView(withId(R.id.s00)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s01)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s02)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s11)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s10)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s20)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s12)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s22)).perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.s21)).perform(ViewActions.click())

        onView(ViewMatchers.withText("It's a draw"))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}