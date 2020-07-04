package NewBostonTutsPolyM;

public class ZazList {
    private Zaz[] theList = new Zaz[5];
    private int i = 0;

    public void add(Zaz _zaz) {
        if (i < theList.length) {
            theList[i] = _zaz;
            System.out.println("Dog added at index " + i);
            i++;
        }
    }
}
