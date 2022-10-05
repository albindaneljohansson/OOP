package OOPInlämning1;
import javax.swing.*;

public class Palm extends Krukväxt implements Printer {

    private final Vätsketyp vätsketyp = Vätsketyp.KRANVATTEN;
    private double vätskeMängd = getLängd()*0.5;

    public Palm (String namn, double höjdiMeter) {
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
                +getLängd()+" m"+ " Växttyp: "+ this.getClass().getSimpleName();
    }
}
