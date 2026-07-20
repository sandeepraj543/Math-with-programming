// write a java program to print first N whole numbers through user input.

import java.util.Scanner;

public class second {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int N = sc.nextInt();

        System.out.println("First " + N + " whole numbers are:");
        for (int i = 0; i < N; i++) {
            System.out.println(i);
        }
    }
}
