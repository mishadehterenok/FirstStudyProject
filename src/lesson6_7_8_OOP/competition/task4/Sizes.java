package lesson6_7_8_OOP.competition.task4;

public enum Sizes {
    XXS(32){
        @Override
        public void getDescription(){
            System.out.println("Size for kids");
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    int euroSize;
    Sizes (int euroSize){
        this.euroSize = euroSize;
    }
    public void getDescription(){
        System.out.println("Size for adults");
    }
}
