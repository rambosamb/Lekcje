package Kolekcje;


import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Cat kot1 = new Cat("Burek");
        Cat kot2 = new Cat("Bialy");
        Cat kot3 = new Cat("Werb");

        ArrayList<Object> lista = new ArrayList();

        lista.add(kot1);
        lista.add(kot2);
        lista.add(kot3);

        ArrayList<Cat> lista2 = new ArrayList<Cat>();

        lista2.add(kot2);
        lista2.add(kot1);
        lista2.remove(1);


        System.out.println(lista);

        for (Object k : lista){
            System.out.println(((Cat)k).name );
            System.out.println("-------------");
        }

        for (Object i : lista2){
            System.out.println(((Cat)i).name);
        }

        System.out.println("........................");

        LinkedList<String> liknkedlista = new LinkedList<>();

        liknkedlista.add("Poznań");
        liknkedlista.add("Warszawa");

        for (Object j : liknkedlista){
            System.out.println(j);

        }
        System.out.println(liknkedlista.size());




    }

}
