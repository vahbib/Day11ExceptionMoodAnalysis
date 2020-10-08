package com.day11.exception;

import java.util.Scanner;

public class MoodAnalyser {
    public String message;

    public MoodAnalyser() {

    }
    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyzeMood() {

        try {
            if (message.contains("sad"))
                return "Sad";
            else
                return "Happy";
        } catch (Exception e) {
            System.out.println("Invalid Input");
            System.out.println("Happy");
            e.printStackTrace();
        }

        return null;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        MoodAnalyser ma1 = new MoodAnalyser();
//        MoodAnalyser ma2 = new MoodAnalyser(sc.nextLine());
//        System.out.println(ma2.analyzeMood());
//        sc.close();
    }
}
