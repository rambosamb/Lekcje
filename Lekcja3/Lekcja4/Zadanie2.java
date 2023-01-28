package Lekcja3.Lekcja4;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        while (firstNumber<=0 || firstNumber > 100)
        {
            System.out.println("Wpisz liczbę od 1 do 100");
            firstNumber = scanner.nextInt();
        }

        System.out.println("Wprowadź drugą liczbę");
        int secondNumber = scanner.nextInt();
        while (secondNumber<=0 || secondNumber > 100)
        {
            System.out.println("Wpisz liczbę od 1 do 100");
            secondNumber = scanner.nextInt();
        }
        System.out.println("Wprowadź trzecią liczbę");
        int thirdNumber = scanner.nextInt();
        while (thirdNumber<=0 || thirdNumber > 100)
        {
            System.out.println("Wpisz liczbę od 1 do 100");
            thirdNumber = scanner.nextInt();
        }

        for (int i = 0; i<100; i++){
            if (i == firstNumber){
                System.out.println(firstNumber);
            }
            if (i == secondNumber){
                System.out.println(secondNumber);
            }
            if (i == thirdNumber){
                System.out.println(thirdNumber);
            }


        }


    }
}
