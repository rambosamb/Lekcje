package Lekcja3.Lekcja4;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {

        System.out.println("Pobieram tekst");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println("Ile razy wydrukować tekst?");
        int number = scanner.nextInt();
        System.out.println("Wydrukować tekst? 1- tak 2- nie");
        int printingText = scanner.nextInt();

        while (printingText != 1 && printingText != 2) {
            System.out.println("Nie rozumiem, napisz liczbe jeszcze raz");
            printingText = scanner.nextInt();
        }


        if (printingText == 1) {
            for (int i = 0; i < number; i++) {
                System.out.println(text);
            }
        }
        if (printingText == 2) {
            System.out.println("Drukowanie anulowane");
        }
    }
}
