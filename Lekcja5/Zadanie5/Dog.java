package Lekcja5.Zadanie5;

public class Dog extends Mammals{


    @Override
    public void speak() {
        super.speak();
        System.out.println("Woof woof");
    }

    @Override
    public int tits(int tits) {
        System.out.println(tits);
        return super.tits(tits);
    }

    @Override
    public void setSize(int size) {
        super.setSize(size);
    }

    @Override
    public int getSize() {
        return super.getSize();
    }
}
