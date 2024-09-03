package api;

import java.util.Random;
import java.util.Scanner;

public class Api1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;

        System.out.print("Enter a number: ");
        try {
            num1 = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid number.");
            scanner.close();
            return;
        }

//        for (int i = 0; i < num1; i++) {
//            int num = random.nextInt(10) + 1;
//            System.out.println(num);
//        }

        int num = random.nextInt(num1);
        System.out.println(num);
        scanner.close();
    }
}
