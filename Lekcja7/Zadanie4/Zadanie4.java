package Lekcja7.Zadanie4;

public class Zadanie4 {
    public static void main(String[] args) {
        iClick klik = new iClick() {
            @Override
            public void onRightButtonClick() {
                System.out.println("You've clicked right button ");
            }

            @Override
            public void onLeftButtonClick() {

                System.out.println("You've clicked left button ");

            }
        };
        klik.onLeftButtonClick();




    }
}
