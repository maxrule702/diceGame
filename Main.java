package com.company;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Integer> tallyCount = new HashMap<Integer, Integer>();
        System.out.println("how many sides do you want?");
        int diceSide = input.nextInt();
        System.out.println("how many times do you want to throw?");
        int userThrow = input.nextInt();
        Random random = new Random();
        while (userThrow != 0) {
            int newRandom = random.nextInt((diceSide) + 1);
            System.out.println(newRandom);
            userThrow--;
        }
    }
}
