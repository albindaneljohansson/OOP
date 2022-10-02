package OOPInlämning1;

public class Palm extends Krukväxt implements Näringslösning {

    final private String vätskeTyp = "kranvatten";
    final private double vätskeMängd = getLängd()*0.5;

    public Palm (String namn, double längd) {
        super (namn, längd);
    }

    public double getVätskeMängd() {
        return vätskeMängd;
    }

    public String getvätskeTyp() {
        return vätskeTyp;
    }
    @Override
    public String Servering () {
        return getNamn() + (" behöver ")+ getVätskeMängd() + " liter " + getvätskeTyp()+(" per dag.");
    }
}
