package Lekcja5.Zadanie2;

public class Card {

    private String[] cardNames = {"ABC", "DEF"};
    private int[] accountValue = {25000, 3500};


    public boolean cardCheck(String cardCheck){
        boolean cardCheckResult = false;
            for (int i = 0; i < cardNames.length; i++) {
                if (cardCheck.equals(cardNames[i])) {
                    cardCheckResult = true;
                    break;
                }
            }
        return cardCheckResult;
    }

    public int getAccountValue(String card) {
        int result = 0;

        for (int i = 0; i < accountValue.length; i++){
            if (card.equals(cardNames[i])){
                result = accountValue[i];
            }
        }
        return result;
    }

    public void updateAccountBalance(String card, int pay){

        for (int i = 0; i < accountValue.length; i++){
            if (card.equals(cardNames[i])){
                accountValue[i] = accountValue[i] - pay;
            }
        }
    }



}
