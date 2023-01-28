package Kolekcje;

import java.util.Collections;
import java.util.HashMap;

public class Map {


    public static void main(String[] args) {


        HashMap<Integer, String> hashmapa = new HashMap<>();

        hashmapa.put(1,"Poniedziałek");
        hashmapa.put(2,"Wtorek");


        for (Object i : hashmapa.values()){

            System.out.println(i);
        }
        System.out.println(Collections.max(hashmapa.values()));
        char a = 'a';
        for (int i = 0; i<100; i++){
            a++;
            System.out.println(a);
        }



    }

}
