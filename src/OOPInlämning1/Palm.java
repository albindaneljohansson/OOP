package OOPInlämning1;

public class Palm extends Krukväxt implements Näringslösning {

    private final Vätsketyp vätsketyp = Vätsketyp.KRANVATTEN;
    private final double vätskeMängd = getLängd()*0.5;

    public Palm (String namn, double längd) {
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
