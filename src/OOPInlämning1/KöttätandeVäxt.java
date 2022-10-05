package OOPInlämning1;
import javax.swing.*;

public class KöttätandeVäxt extends Krukväxt implements Printable {

    private final Vätsketyp vätsketyp = Vätsketyp.PROTEINDRYCK;
    private double vätskeMängd = getLängd()*0.2+0.1;

    public KöttätandeVäxt (String namn, double höjdiMeter) {
        super (namn, höjdiMeter);
    }
    public String getNamn() { //Polymorfism
        return super.getNamn();
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
    @Override
    public String printMe() {
        return "Namn: " + getNamn() +" Höjd: "
                +getLängd()+" m"+" Växttyp: " + this.getClass().getSimpleName();
    }
}
