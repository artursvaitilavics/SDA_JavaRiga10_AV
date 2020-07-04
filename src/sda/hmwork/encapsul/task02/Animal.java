package sda.hmwork.encapsul.task02;

public class Animal {
    private String species;
    private boolean isDomisticated;

    public Animal(String species, boolean isDomisticated) {
        this.species = species;
        this.isDomisticated = isDomisticated;
    }

    public Animal(boolean isDomisticated){
        this("", isDomisticated);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if (species.equals("")){
            System.out.println("Must define species ");
        }else {
            this.species = species;
        }
    }

    public boolean isDomisticated() {
        return isDomisticated;
    }

    public void setDomisticated(boolean domisticated) {
        isDomisticated = domisticated;
    }
}
