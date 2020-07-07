package sda.hmwork.abstractHM.task02.components;

import sda.hmwork.abstractHM.task02.components.templ.Exhaust;

public class SomePipe extends Exhaust {
    String filter = "Strong";

    @Override
    public void modifyQuality() {
        filter = "Weak";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\tCurved pipe with " + filter + " filter";
    }
}
