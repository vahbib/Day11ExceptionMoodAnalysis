package com.day11.test.exception;

import com.day11.exception.MoodAnalyser;
import com.day11.exception.MoodAnalysisException;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MATest {
    @Test
    public void TestAnalyzeMood() throws MoodAnalysisException {
        MoodAnalyser ma = new MoodAnalyser("I am Good");
        String mood = "Happy";
        Assert.assertThat(mood, CoreMatchers.is(ma.analyzeMood()));
    }
}
