package Lekcja6.Zadanie2;

public class Factory {

    Product[] myProduct = new Product[100];

    public void createNewProduct(Product[] myProduct){

        for (int i = 0; i < 100; i++){
            myProduct[i] = new Product();
        }
    }
}
