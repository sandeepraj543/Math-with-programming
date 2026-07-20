// write a java program to print all integers between -N to +N through user input.

// import java.util.Scanner;

// public class third {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter any -ve numbers :");
//         int N = sc.nextInt();

//         System.out.print("Enter any +ve numbers :");
//         int M = sc.nextInt();

//         System.out.println("All integers from " + (N) + " to " + M + " are:");
//         for (int i = N; i <= M; i++) {
//             System.out.println(i);
//         }
//     }
// }



// other way to print all integers from -N to +N through user input.

import java.util.Scanner;

public class third {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any numbers:");
        int N = sc.nextInt();

        System.out.println("all integers from: " + (-N) + "TO" + (N) + "are:");
        for (int i = -N; i <= N; i++) {
            System.out.println(i);
        }
    }
}
