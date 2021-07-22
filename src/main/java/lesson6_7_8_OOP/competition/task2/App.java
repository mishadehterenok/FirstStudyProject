package lesson6_7_8_OOP.competition.task2;

public class App {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(8);
        Drums drums = new Drums(3);
        Pipe pipe = new Pipe(2);
        Instrument[] instruments = {guitar,drums,pipe};
        for(Instrument i: instruments){
            i.play();
        }
    }
}
