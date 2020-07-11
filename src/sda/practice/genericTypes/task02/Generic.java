package sda.practice.genericTypes.task02;

public class Generic<V> {
    private V object;

    public Generic(V object) {
        this.object = object;
    }

    public V getObject() {
        return object;
    }

    public void setObject(V object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Generic " + object;
    }
}
