package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        System.out.println("Primary numbers from " + a + " to " + b +" : " + Exercise.Calculate(a, b));
    }
}
