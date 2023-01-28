package Lekcja3.Lekcja4;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy liczba jest pierwsza? ");
            double number = scanner.nextInt();
            while (number < 2) {
                System.out.println("Liczba nie jest pierwsza, napisz jeszcze raz:");
                number = scanner.nextInt();
            }
            while (number == 4 || number == 2) {
                System.out.println("Liczba nie jest pierwsza");
                number = scanner.nextInt();
            }
            boolean primenumber = true;
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    primenumber = false;
                    break;
                }
            }
            if (primenumber) {
                System.out.println("Liczba jest pierwsza");
            } else System.out.println("Liczba nie jest pierwsza");


    }
}
