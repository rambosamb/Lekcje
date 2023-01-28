package Lekcja10.Zadanie1;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        System.out.println(lettersCounter());

    }

    public static int lettersCounter(){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        a = null;
        return a.length();
    }

}
