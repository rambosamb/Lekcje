package Lekcja3.Lekcja4;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz punkty za styl ");
        double stylePoints = scanner.nextDouble();
        System.out.println("Wpisz punkty za efekty ");
        double effectPoints = scanner.nextDouble();
        System.out.println("Wpisz punkty za rezultat ");
        double ressultPoints = scanner.nextDouble();

        stylePoints = stylePoints*0.2;
        effectPoints = effectPoints*0.3;
        ressultPoints = ressultPoints*0.5;

        double result = stylePoints + effectPoints + ressultPoints;

        System.out.println(result);





    }
}
