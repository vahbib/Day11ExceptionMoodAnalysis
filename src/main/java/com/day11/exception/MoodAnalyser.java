package com.day11.exception;

import java.util.Scanner;

public class MoodAnalyser {
    public String message;
    public enum moodEnum {
        Empty,
        NonEmpty
    }

    public MoodAnalyser() {

    }
    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyzeMood() throws  MoodAnalysisException {
        moodEnum me = moodEnum.NonEmpty;
        try {
            if (message.contains("sad"))
                return "Sad";
            else
                return "Happy";
        } catch (Exception e) {
            me = moodEnum.Empty;
            throw new MoodAnalysisException("Invalid Input");

        }
        finally {
            System.out.println("My Mood is: "+me);
        }
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        MoodAnalyser ma1 = new MoodAnalyser();
//        MoodAnalyser ma2 = new MoodAnalyser(sc.nextLine());
//        System.out.println(ma2.analyzeMood());
//        sc.close();
    }
}
