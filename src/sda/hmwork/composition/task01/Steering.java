package sda.hmwork.composition.task01;

public class Steering {
    private String material;
    private Bell bell;

    public Steering(String material) {
        this.material = material;
    }

    public Bell getBell() {
        return bell;
    }

    public void setBell(Bell bell) {
        this.bell = bell;
    }
}
