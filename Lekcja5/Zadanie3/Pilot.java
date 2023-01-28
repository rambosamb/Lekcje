package Lekcja5.Zadanie3;

import java.util.Scanner;

public class Pilot {

    Scanner scanner = new Scanner(System.in);

    TV TV = new TV();


    public void start(){
        isStarted();
       if (scanner.next().equals("on")) {
           TV.setOnOff(true);

           while (TV.isOnOff()){
               operation(scanner.next());
           }
           System.out.println("TV jest wyłączony");
       }

    }



    private void isStarted(){
        System.out.println(
                "Aby wlaczyc TV wpisz on, aby go wylaczyc: off\n" +
                        "Aby wybrac kanal wpisz cyfry od 1 do 9\n" +
                        "Aby zmienic kanal wpisz + lub -\n" +
                        "Aby zwiekszyc glosnosc wpisz vol+\n" +
                        "Aby zmniejszyc glosnosc wpisz vol-\n" +
                        "Wylaczenie TV konczy prace programu\n" +
                        "Pamietaj, aby najpierw go wlaczyc."
        );
    }

    private void operation(String o){
        if (o.equals("on")){
            TV.setOnOff(true);
        }
        else if (o.equals("off")){
            TV.setOnOff(false);
        } else if (o.equals("1") || o.equals("2") || o.equals("3") || o.equals("4")  || o.equals("5")  || o.equals("6") || o.equals("7")  || o.equals("8")  || o.equals("9")  ) {
            TV.setChannels(o);
        } else if (o.equals("+")) {
            TV.changeChannels(true);
        } else if (o.equals("-")) {
            TV.changeChannels(false);
        } else if (o.equals("vol+")){
            TV.changeVolume(true);
        } else if (o.equals("vol-")) {
            TV.changeVolume(false);
        } else {
            System.out.println("Nie rozpoznaje przycisku");
        }

    }







}
