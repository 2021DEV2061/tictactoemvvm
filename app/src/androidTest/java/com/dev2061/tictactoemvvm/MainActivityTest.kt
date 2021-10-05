package com.dev2061.tictactoemvvm

import androidx.test.espresso.Espresso.onView
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
}