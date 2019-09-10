package math.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        // Recursion
        Scanner recursion = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = recursion.nextInt();
        int factorial = fact(num);
        System.out.println("Factorial of entered number using Recursion is: "+factorial);


        // Iteration
        Scanner iteration = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = iteration.nextInt();
        int result = factorial(n);
        System.out.println("The factorial of " + n + " using Iteration is " + result);


    }
    // Recursion Method
    static int fact(int n) {
        int output;
        if(n==1){
            return 1;
        }
        output = fact(n-1)* n;
        return output;

    }

    // Iteration Method
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}


