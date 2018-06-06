package com.ragul.main;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Main {

//check the number is prime or not
    public static boolean isPrime(int number) {
        for (int i = 2; i <= sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    //find tha prime number
    public static ArrayList<Integer> findPrime(int max) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int j = 2; j < max; j++) {
            if (isPrime(j)) {
                result.add(j);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("tweets the number: ");

        int n = in.nextInt();

        //print prime numbers
        findPrime(n).forEach(value -> System.out.print(value+" "));
    }
}
