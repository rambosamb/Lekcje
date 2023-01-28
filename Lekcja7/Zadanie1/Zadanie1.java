package Lekcja7.Zadanie1;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        getText();
        int a;
        a = Integer.parseInt(getText());
        System.out.println(a);

    }

    public static String getText(){
       Scanner scanner = new Scanner(System.in);
       return scanner.next();
    }

}
