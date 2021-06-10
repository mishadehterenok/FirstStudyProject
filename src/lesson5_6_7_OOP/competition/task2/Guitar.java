package lesson5_6_7_OOP.competition.task2;

public class Guitar implements Instrument{
    private int countStr;

    public int getCountStr() {
        return countStr;
    }

    public void setCountStr(int countStr) {
        this.countStr = countStr;
    }

    public Guitar(int countStr) {

        this.countStr = countStr;
    }
    @Override
    public void play(){
        System.out.printf("Играет гитара, количество струн: %d\n",countStr);
    }
}
