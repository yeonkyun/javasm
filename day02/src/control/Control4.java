package control;

import java.util.Scanner;

public class Control4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Command: ");
            String cmd = scanner.nextLine();

            if (cmd.equals("q")) {
                System.out.println("Quit: ");
                break;
            } else if (cmd.equals("i")) {
                System.out.println("Insert: id");
                String id = scanner.nextLine();
                System.out.println("Insert: pw");
                String pw = scanner.nextLine();
                System.out.println("id: " + id + ", pw: " + pw);
            } else if (cmd.equals("s")) {
                System.out.println("Select: ");
                break;
            } else {
                System.out.println("Try Again: ");
            }
        }
        scanner.close();
    }
}
