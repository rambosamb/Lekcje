package Lekcja6.Zadanie3;

public class Punkt3d extends Punkt{
    int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }


    public Punkt3d(int x, int y, int z) {
        super.parameters(x, y);
        this.z = z;

    }
}
