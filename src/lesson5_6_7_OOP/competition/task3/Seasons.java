package lesson5_6_7_OOP.competition.task3;

public enum Seasons {
    SUMMER("Summer","+25"){
        @Override
        public void getDescription (){
            System.out.println("Warm time of the year");
        }
    },
    AUTUMN("Autumn","+8"),
    WINTER("Winter","-15"),
    SPRING("Spring","+15");

    String season;
    String temperature;

    Seasons(String season,String temperature){
        this.season = season;
        this.temperature = temperature;
    }
    public String getSeason() {
        return season;
    }
    public String getTemperature() {
        return temperature;
    }

    public void printInfo(){
        System.out.println(season + " " + temperature);
    }
    public void iLove (Seasons season){
        System.out.println("I love " + getSeason());

        /*System.out.print("I love ");
        switch (season){
            case AUTUMN:
                System.out.println("Autumn");
                break;
            case WINTER:
                System.out.println("Winter");
                break;
            case SPRING:
                System.out.println("Spring");
                break;
            case SUMMER:
                System.out.println("Summer");
                break;
        }*/
    }
    public void getDescription (){
        System.out.println("Cold time of the year");
    }
}
