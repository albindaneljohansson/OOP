package OOPInlämning1;

public class Kaktus extends Krukväxt implements Näringslösning {

    private final Vätsketyp vätsketyp = Vätsketyp.MINERALVATTEN;
    private final double vätskeMängd = 0.02;

    public Kaktus (String namn, double längd) {
        super (namn, längd);
    }

    public double getVätskeMängd() {
        return vätskeMängd;
    }

    public Vätsketyp getvätskeTyp() {
        return vätsketyp;
    }

    @Override
    public String Servering () {
        return getNamn() + (" behöver ")+ getVätskeMängd() + " liter " + getvätskeTyp().vätska+(" per dag.");
    }
}
