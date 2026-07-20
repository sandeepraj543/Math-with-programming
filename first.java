// write a java program to print first N natural numbers through user input.

import java.util.Scanner;

public class first {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any natural number:");
        int N = sc.nextInt();

        System.out.println("First " + N + " natural numbers are:");
        for (int i = 1; i <= N; i++) {
            // System.out.print(i + " "); // print in the same line.
            System.out.println(i);  // print in the next line.
        }
    }
}
