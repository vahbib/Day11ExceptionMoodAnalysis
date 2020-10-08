package com.day11.test.exception;

import com.day11.exception.MoodAnalyser;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MATest {
    MoodAnalyser ma = new MoodAnalyser("Feeling sad today");

    @Test
    public void TestAnalyzeMood() {
        String mood = "Sad";
        Assert.assertThat(mood, CoreMatchers.is(ma.analyzeMood()));

    }
}
