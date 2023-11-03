package com.example.interview

import android.widget.Toast
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.RootMatchers
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.hamcrest.core.Is.`is`
import androidx.test.espresso.accessibility.AccessibilityChecks
import androidx.test.espresso.matcher.ViewMatchers.hasFocus
import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Rule
import java.util.function.Predicate.not

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    val activityRule = ActivityTestRule(Login::class.java)

    @Test fun testLoginSuccess() {
    // Type a valid user id and password
        onView(withId(R.id.userid)).perform(typeText("donapati@gmail.com"))
        onView(withId(R.id.passwordid)).perform(typeText("Siva@123")) // Click the login button
        Espresso.closeSoftKeyboard()
        onView(withId(R.id.loginbtn)).perform(click())
        onView(withId(R.id.search)).check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.search)).check(ViewAssertions.matches(hasFocus()))
    }

    companion object {
        @JvmStatic
        @BeforeClass
        fun setup(): Unit {
            AccessibilityChecks.enable().setRunChecksFromRootView(true)
        }
    }
}