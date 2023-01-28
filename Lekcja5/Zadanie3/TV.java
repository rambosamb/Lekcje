package Lekcja5.Zadanie3;

public class TV {
    private boolean onOff = false;
    private String currentChannel = "1";
    private final String channels[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private int volume = 1;


    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
        if (onOff) {
            System.out.println("Telewizor jest wlaczony");
        } else {
            System.out.println("Telewizor wyłączony");
        }
    }

    public void setChannels(String o) {
        currentChannel = o;
        System.out.println("Aktualny kanal to " + o);
    }


    public void changeChannels(boolean setTrueOrFalse) {
        int nextChannel = 0;
        for (int i = 1; i < channels.length; i++) {
            if (currentChannel.equals(channels[i])){
                nextChannel = i;
            }
        }

        if (setTrueOrFalse && nextChannel==9){
            currentChannel = "1";
        }

        else if (!setTrueOrFalse && nextChannel == 1){
            currentChannel = "9";
        } else if (setTrueOrFalse) {
            currentChannel = channels[++nextChannel];
            System.out.println("aktualny kanal to " + currentChannel);
        } else  {
            currentChannel = channels[--nextChannel];
            System.out.println("aktualny kanal to " + currentChannel);
        }
    }

    public void changeVolume(boolean setChangeVolume){
        if (setChangeVolume){
            if (volume < 15){
                volume++;
                System.out.println(volume);
            }
        }
        else {
            if (volume > 1){
                volume--;
                System.out.println(volume);
            }
        }
        System.out.println("Aktualna gloscnosc " + volume);
    }
}
