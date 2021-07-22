package lesson6_7_8_OOP.competition.task2;

public class Pipe implements Instrument {
    private int diameter;

    public Pipe(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.printf("Играет тура, диаметр: %d\n",diameter);
    }
}
