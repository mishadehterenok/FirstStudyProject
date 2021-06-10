package lesson5_6_7_OOP.competition.task3;

public enum Seasons {
    SUMMER{
        @Override
        public String displayInfo(){
            return "Warm";
        }
    },AUTUMN,WINTER,SPRING

    public String displayInfo(){
        return "Seasons";
    }


}
