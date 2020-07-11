package sda.practice.composition;

public class Dog {
    private Muzzle muzzle;

    public Dog(Muzzle muzzle) {
        this.muzzle = muzzle;
    }

    public Muzzle getMuzzle() {
        return muzzle;
    }

    public void setMuzzle(Muzzle muzzle) {
        this.muzzle = muzzle;
    }

}
