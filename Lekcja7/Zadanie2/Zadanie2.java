package Lekcja7.Zadanie2;


import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        System.out.println("Wpisz liczbę, a obliczę silnie ");
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int counter = 1;
        int counter2;
        while (str < 0){
            System.out.println("Wpisz liczbę od 1 wzwyż ");
            str = scanner.nextInt();
        }

        if (str == 1){
            System.out.println("Silnia = " + str);
        }
        else {
            for (int i = 1; i <= str; i++) {
                counter *= i;


            }
            System.out.println(counter);
        }
        System.out.println("Wpisz liczbę, a obliczę silnie rekurencyjnie ");
        int a = scanner.nextInt();
        strCount(a);
        System.out.println(strCount(a));
    }
    public static int strCount(int a){
        if (a <= 1){
            return 1;
        }
        else return a*strCount(a-1);

    }


}
