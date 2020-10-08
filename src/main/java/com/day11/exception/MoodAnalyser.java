package com.day11.exception;

import java.util.Scanner;

public class MoodAnalyser {
    public String analyzeMood(String mood) {
        if (mood.contains("sad"))
            return "Sad";
        else
            return "Happy";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MoodAnalyser ma = new MoodAnalyser();
        System.out.println(ma.analyzeMood(sc.nextLine()));
        sc.close();
    }
}
