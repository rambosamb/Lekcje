package Lekcja6.Zadanie2;

public class Product {


    private static int id = 0;
    private final String name = "Product";
    private int tempId;


    Product(){
        tempId = id;
        id++;
    }

    public void start(){
        System.out.println("My name is " + name + ", my id is " + tempId);
    }




}
