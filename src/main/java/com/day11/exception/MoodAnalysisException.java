package com.day11.exception;

public class MoodAnalysisException extends Exception{
    MoodAnalysisException(String s){
        super(s);
        System.out.println("Re-Enter");
    }
}
