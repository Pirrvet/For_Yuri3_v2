package com.example.for_yuri3;
import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.for_yuri3.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;
import org.junit.runner.RunWith;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParentIndex;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;
@RunWith(AndroidJUnit4.class)


public class MainActivityTest
{
@Rule public final ActivityRule<MainActivity> main = new ActivityRule<>(MainActivity.class);
    @Test
    public void buttonIsDisplayed()
    {
        onView(withId(R.id.button1)).check(ViewAssertions.matches(isDisplayed()));
        //.perform(click());
    }
    @Test
    public void buttonIsNotDisplayed()
    {
        onView(withId(R.id.button5)).check(ViewAssertions.matches(not(isDisplayed())));
    }

    //            .intend    почитать что это


//onView(withId(R.id.button5)).check(ViewAssertions.matches(withEffectiveVisibility(ViewMatchers.Visibility.INVISIBLE)));

}