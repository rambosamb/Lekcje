package Lekcja5.Zadanie2;

import java.util.Scanner;

public class Bankomat {

    private String cardName;
    private Card card = new Card();
    private Scanner scanner = new Scanner(System.in);
    int choice = 0;

    public void start(){
        System.out.println("Wpisz nazwę karty ");
        cardName = scanner.next();

        if (!card.cardCheck(cardName)){
            System.out.println("Zła nazwa karty, koniec akcji");
        }

        else{
                while (choice != 3) {
                System.out.println("wybierz operacje:" +
                        "Aby sprawdzić stan konta wybierz 1" +
                        "Aby wyplacic pieniadze wybierz 2" +
                        "Aby zakończyć program wybierz 3");
                choice = operation(scanner.nextInt());
            }

        }
        }
    private void payCheck(int pay){

        if (pay <= card.getAccountValue(cardName)){
            card.updateAccountBalance(cardName, pay);
            System.out.println("Wypłacono " + pay +"\n");
        }
        else System.out.println("Za mało środków na karcie");
    }
    private int operation(int operationMode){
        switch (operationMode){
            case 1:
                System.out.println("Masz " + card.getAccountValue(cardName));
            case 2:
                System.out.println("Ile chcesz wypłacić?");
                payCheck(scanner.nextInt());
                break;
            case 3:
                System.out.println("Koniec programu");
                break;
            default:
                System.out.println("Nie rozpoznano polecenia");
        }
        return operationMode;
    }


}
