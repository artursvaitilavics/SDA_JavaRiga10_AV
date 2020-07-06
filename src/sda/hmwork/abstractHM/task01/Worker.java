package sda.hmwork.abstractHM.task01;

public class Worker extends Human {
    private int salary;
    private String occupation;


    public Worker(String name, String gender,
                  int age, int salary,
                  String occupation) {
        super(name, gender, age);
        this.salary = salary;
        this.occupation = occupation;
    }

    @Override
    public void terminate() {
        System.out.println("Person had to be let go, or quit");
        salary = 0;
        occupation = "Ex employee";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\tOccupation= " + occupation +
                "\n\tSalary= " + salary;
    }
}
