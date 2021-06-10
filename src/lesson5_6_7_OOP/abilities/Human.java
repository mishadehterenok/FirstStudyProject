package lesson5_6_7_OOP.abilities;

public class Human {
     private String name;
     private Ability ability;

     public void setAbilities(String first,String second){
          this.ability = new Ability(first,second);
     }
     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void printInfo (){
          System.out.printf("Name: %s\n", getName());
          System.out.printf("abilityFirst: %s\nabilitySecond: %s",ability.getFirst(),ability.getSecond());
     }
}















     /*public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public int getWeight() {
          return weight;
     }

     public void setWeight(int weight) {
          this.weight = weight;
     }

     public int getHeight() {
          return height;
     }

     public void setHeight(int height) {
          this.height = height;
     }

     public void printInfo (){
          System.out.printf("Name: %s\n", name);
                 // "Age: %d\nWeight: %d\nHeight: %d\n",name,age,weight,height);
          System.out.printf("abilityFirst: %s\nabilitySecond: %s",ability.getFirst(),ability.getSecond());
     }
}*/
