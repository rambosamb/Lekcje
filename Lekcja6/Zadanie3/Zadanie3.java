package Lekcja6.Zadanie3;

public class Zadanie3 {
    public static void main(String[] args) {
        int a,b,c;

        Punkt3d[] punkty3d = new Punkt3d[10];

        for (int i = 0; i < 10; i++){

            a = i + 2;
            b = i * 2;
            c = i + 5;
            punkty3d[i] = new Punkt3d(a, b, c);
        }
        printPoints(punkty3d);

    }

    public static void printPoints(Punkt3d[] punkt3d){
        for (Punkt3d i : punkt3d){
            System.out.println("id" + i + " x=" + i.getX() + " y=" + i.getY() + " z=" + i.getZ());}
    }

}
