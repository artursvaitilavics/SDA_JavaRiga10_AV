package sda.Encaps.exrcise.exc1;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String race;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            System.out.println("the dog is too young");
        }else{
            this.age = age;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <= 0){
            System.out.println("please feed your dog");
        }else{
            this.weight = weight;
        }
    }

    private int weight;

    public Dog(String name,
               int age,
               String gender,
               String race,
               int weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }


    public Dog(String gender,
               String race
                       ) {
        this("name", 1, gender, race, 2);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                '}';
    }
}
