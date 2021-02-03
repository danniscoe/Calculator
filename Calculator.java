package com.tts;

import java.io.Console;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double ans;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers. Press enter after each number: ");
        double num1 = reader.nextDouble();
        double num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /, √): ");
        char op = reader.next().charAt(0);

        if (op == '+') {
            ans = num1 + num2;
        } else if (op == '-') {
            ans = num1 - num2;
        } else if (op == '*') {
            ans = num1 * num2;
        } else if (op == '/') {
            ans = num1 / num2;
        } else if (op == '√') {
            ans = num1 / num2;
        } else {
            System.out.printf("Error! Enter the correct operator!");
            return;
        }
        System.out.print("\nYour results:\n");
        System.out.print(num1 + " " + op + " " + num2 + " = " + ans);
        System.out.print("  Want to try another operator?");
        System.out.print("  Y/N: ");

        Scanner input = new Scanner(System.in);;
        String Response = input.nextLine();
        if (Response != ("y")) {
            System.out.println("Try again soon! This part of the code is still under construction!");
        }   // I wanted to find a way to make it loop back to allow the input of another operator.
            // Work in progress on that aspect.
    }

    public int square(int num) {
        return 0;
    }

    public int add(int num1, int num2) {
        return 0;
    }

    public String subtract(int num1, int num2) {
        return null;
    }

    public String multiply(int num1, int num2) {
        return null;
    }

    public String divide(int num1, int num2) {
        return null;
    }
}
/*
I am having issues making this portion of the code work with the basic calc features.  Not giving up!
class MagicCalculator extends Calculator {
    private int num;
    private double a;
    private double b;

   private static void main(String args[])
    {
        double degree = sc.nextDouble ();
        double radians = Math.toRadians (degree);

        System.out.println ("Sin is: " + Math.sin (radians));
        System.out.println ("Cosine is: " + Math.cos (radians));
        System.out.println ("Tangent is: " + Math.tan (radians));
        System.out.println ("The Factorial of " + num + " is " + myMagic.factorial(num));

        System.out.println("Log is "+Math.log(radians));
        System.out.println ("Enter a number and its exponent :");


        System.out.println("The exponent of " + a + " raised to the " + b + " power is: " + Math.pow(a,b));
    }
    }
    }
*/

