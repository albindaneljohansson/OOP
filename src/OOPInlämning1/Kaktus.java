package OOPInlämning1;

public class Kaktus extends Krukväxt implements Näringslösning {

    final private String vätskeTyp = "mineralvatten";
    final private double vätskeMängd = 0.2;

    public Kaktus (String namn, double längd) {
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
