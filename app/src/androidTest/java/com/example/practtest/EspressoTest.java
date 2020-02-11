package com.example.practtest;

import android.app.Activity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class EspressoTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void botonEuADol() {
        Espresso.onView(withId(R.id.editTextNumero)).perform(typeText("135"), closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonEUaDO)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("148.50")));

    }

    @Test
    public void botonDolAEu() {
        Espresso.onView(withId(R.id.editTextNumero)).perform(typeText("22"), closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonDOaEU)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("20.00")));

    }

    @Test
    public void botonLiAEu() {
        Espresso.onView(withId(R.id.editTextNumero)).perform(typeText("267"), closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonLIaEU)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("315.06")));

    }

    @Test
    public void botonEuALi() {
        Espresso.onView(withId(R.id.editTextNumero)).perform(typeText("38.94"), closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonEUaLI)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("33.00")));

    }

}
