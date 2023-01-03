package src.math.problems;

import java.util.Scanner;
public class Factorial {

    //public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        private static int factRecursive(int number) {

            if (number == 1)
                return 1;


            return number * factRecursive(number - 1);
        }

        private static int factIterative(int number) {

            int factorial = 1;
            for (int iNumber = 1; iNumber <= number; iNumber++) {
                factorial = factorial * iNumber;
            }
            return factorial;
        }

        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {

                /* Calculate factorial for input number */
                System.out.printf(" Enter input number : ");
                int number = scanner.nextInt();

                int factNumber = factRecursive(number);
                System.out.printf("factorial(%d) - Recursive method: %d\n",number,factNumber);

                factNumber = factIterative(number);
                System.out.printf("factorial(%d) - Iterative method: %d\n",number,factNumber);
            }









    }
}
