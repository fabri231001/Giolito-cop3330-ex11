/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Fabrizio Giolito
 */
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Main {

    private static DecimalFormat d = new DecimalFormat("#.##");

    public static void main(String[] args) {
        System.out.println("How many euros are you exchanging? ");
        Scanner s1 = new Scanner(System.in);
        int c_from = s1.nextInt();
        System.out.println("What is the exchange rate? ");
        Scanner s2 = new Scanner(System.in);
        double rate = s1.nextDouble();
        double c_to = rate * c_from;
        d.setRoundingMode(RoundingMode.UP);
        System.out.println(c_from + " euros at an exchange rate of " + rate + " is\n" + d.format(c_to) + " U.S. dollars.");
    }
}
