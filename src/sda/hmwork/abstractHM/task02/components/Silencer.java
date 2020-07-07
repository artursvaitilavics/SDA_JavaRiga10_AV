package sda.hmwork.abstractHM.task02.components;

import sda.hmwork.abstractHM.task02.components.templ.Exhaust;

public class Silencer extends Exhaust {
    int filterStrenght = 50;

    @Override
    public void modifyQuality() {
        filterStrenght-=10;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\tSilencer with quality of "
                + filterStrenght;
    }
}
