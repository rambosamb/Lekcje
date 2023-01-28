package Lekcja3;

public class Zadanie4 {
    public static void main(String[] args) {


        int[] tab = new int[10];

        for (int i = 1; i < tab.length+1; i++){

            tab[i-1] = (10+1)*i;
            System.out.println(tab[i-1]);

        }



    }


}
