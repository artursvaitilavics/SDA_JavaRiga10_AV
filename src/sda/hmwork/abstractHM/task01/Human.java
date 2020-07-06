package sda.hmwork.abstractHM.task01;

abstract class Human {
    private String name;
    private String gender;

    private int age;

    public Human(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    abstract void terminate();

    @Override
    public String toString() {
        return name +
                "\n\tgender= " + gender
                + "\n\tage= " + age;
    }
}
