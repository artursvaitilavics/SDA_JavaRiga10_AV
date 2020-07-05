package sda.hmwork.composition.task02.components;

public class UsbPort extends Port {
    private String name;
    private String function;
    int transferSpeed;

    public UsbPort(String name, String function, int transferSpeed) {
        super(name, function);
        this.name = name;
        this.function = name;
        this.transferSpeed = transferSpeed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getFunction() {
        return function;
    }

    @Override
    public void setFunction(String function) {
        this.function = function;
    }

    public int getTransferSpeed() {
        return transferSpeed;
    }

    public void setTransferSpeed(int transferSpeed) {
        this.transferSpeed = transferSpeed;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n\t\tTransfer speed: "
                + transferSpeed;
    }
}
