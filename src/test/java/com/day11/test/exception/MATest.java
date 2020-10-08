package com.day11.test.exception;

import com.day11.exception.MoodAnalyser;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MATest {

    @Test
    public void TestAnalyzeMood() {
        MoodAnalyser ma = new MoodAnalyser(null);
        String mood = null;
        Assert.assertThat(mood, CoreMatchers.is(ma.analyzeMood()));
    }

}
