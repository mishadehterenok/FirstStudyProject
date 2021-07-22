package lesson6_7_8_OOP.task5;

public class Aspirant extends Student {
    private String scienceWork;

    public Aspirant(String firstName, String lastName, int group, double averageMark,String scienceWork){
        super(firstName,lastName,group,averageMark);
        this.scienceWork = scienceWork;
    }

    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    @Override
    public int getScholarship(){
        if (super.getAverageMark() == 5){
            return 200;
        }
        else {return 180;}
    }
}
