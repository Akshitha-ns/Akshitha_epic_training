package pattern;

import java.util.Scanner;

public class Heart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        // Upper Part
        for (int i = n / 2; i <= n; i += 2) {

            // Left spaces
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Part
        for (int i = n; i >= 1; i--) {

            // Left spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}