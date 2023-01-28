package Lekcja7.Zadanie5;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        int[] tab = {25, 49, 99, 9, 99999, 5};


        System.out.println(count9(tab));

    }




    public static int count9(int[] a){
        int b = 0;
        for (int i=0; i<a.length; i++){
            if (a[i] == 9){
                b++;
            }
        }
        return b;



    }


}
