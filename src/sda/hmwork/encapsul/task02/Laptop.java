package sda.hmwork.encapsul.task02;

public class Laptop {
    private String make;
    private String os;
    private boolean hasTouchscreen;

    public Laptop(String make, String os, boolean hasTouchscreen) {
        this.make = make;
        this.os = os;
        this.hasTouchscreen = hasTouchscreen;
    }

    public Laptop(boolean hasTouchscreen) {
        this("", "", hasTouchscreen);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make.equals("")) {
            System.out.println("Must have a make");
        } else {
            this.make = make;
        }
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        if (os.equals("")) {
            System.out.println("Please install any OS");
        } else {
            this.os = os;
        }
    }

    public boolean isHasTouchscreen() {
        return hasTouchscreen;
    }

    public void setHasTouchscreen(boolean hasTouchscreen) {
        this.hasTouchscreen = hasTouchscreen;
    }
}
