package lesson5_6_7_OOP.competition.task2;

public class Drums implements Instrument{
    private int size;

    public Drums(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    @Override
    public void play(){
        System.out.printf("Играют барабаны, размер: %d\n",size);
    }
}
