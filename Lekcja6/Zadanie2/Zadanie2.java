package Lekcja6.Zadanie2;

public class Zadanie2 {
    public static void main(String[] args) {

        Factory factory = new Factory();
        factory.createNewProduct(factory.myProduct);

        factory.myProduct[0].start();
        factory.myProduct[5].start();
        factory.myProduct[99].start();

    }
}
