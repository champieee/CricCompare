package com.company;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        TestStats p = new TestStats();
        p.HashMap();
        HashMap<String, ArrayList<String>> testBatters = p.returnHash();
        Scanner input = new Scanner(System.in);

        ODIStats p1 = new ODIStats();
        p1.HashMap();
        HashMap<String, ArrayList<String>> odiBatters = p1.returnHash();

        T20Stats p2 = new T20Stats();
        p2.HashMap();
        HashMap<String, ArrayList<String>> t20Batters = p2.returnHash();
        String player1;
        String player2;
        System.out.println("Enter initials and then last name, if that doesn't work then type out the whole name");
        do {
            System.out.println("Enter the first players name: ");
            player1 = input.nextLine();
        } while (testBatters.get(player1) == null && odiBatters.get(player1) == null);

        do {
            System.out.println("Enter the second players name: ");
            player2 = input.nextLine();
        } while (testBatters.get(player2) == null && odiBatters.get(player2) == null);

        System.out.println("Test: ");
        System.out.println(player1 + ": " + testBatters.get(player1));
        System.out.println(player2 + ": " + testBatters.get(player2));
        System.out.println(" ");
        System.out.println("ODI: ");
        System.out.println(player1 + ": " + odiBatters.get(player1));
        System.out.println(player2 + ": " + odiBatters.get(player2));
    }
}
