package sda.hmwork.composition.task02.components;

public class ScreenGlossy extends Display {
    private int glossiness;

    public ScreenGlossy(String name, int size, int glossiness) {
        super(name, size);
        this.glossiness = glossiness;
    }

    public int getGlossiness() {
        return glossiness;
    }

    public void setGlossiness(int glossiness) {
        this.glossiness = glossiness;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t\tGlossiness:"
                + glossiness;
    }
}
