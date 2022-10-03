package OOPInlämning1;
import javax.swing.*;

public class Kaktus extends Krukväxt implements Printer {

    private final Vätsketyp vätsketyp = Vätsketyp.MINERALVATTEN;
    private final double vätskeMängd = 0.02;

    public Kaktus (String namn, double höjdiMeter) {
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
    public void printMe() {
        JOptionPane.showMessageDialog(null,"Namn: " + getNamn() +"Höjd: "
                +getLängd()+"Växttyp: "+getClass().getName());
    }
}
