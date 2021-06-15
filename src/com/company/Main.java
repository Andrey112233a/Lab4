package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number N:");
        double N = in.nextDouble();
        double a = 0;
        double s = 0;
        double z = 0;
        for (double i = 1; i<=N;i++){
            a = a+Math.sin(i);
            s = s+Math.cos(i);
            z = a/s;
        }
        System.out.println("Answer: ");
        System.out.println(z);
    }
}
