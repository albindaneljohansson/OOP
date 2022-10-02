package OOPInlämning1;

public class KöttätandeVäxt extends Krukväxt implements Näringslösning {

    private final Vätsketyp vätsketyp = Vätsketyp.PROTEINDRYCK;
    private final double vätskeMängd = getLängd()*0.2+0.1;

    public KöttätandeVäxt (String namn, double längd) {
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
