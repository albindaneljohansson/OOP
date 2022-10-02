package OOPInlämning1;

public class Kaktus extends Krukväxt implements Näringslösning {

    protected Vätsketyp vätsketyp = Vätsketyp.MINERALVATTEN;
    final private double vätskeMängd = 0.2;

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
