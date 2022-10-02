package OOPInlämning1;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Huvudprogram {

    public static void main(String[] args) {
        Huvudprogram h1 = new Huvudprogram();
    }
    public  Huvudprogram(){

        Krukväxt Igge = new Kaktus ("Igge", 0.2);
        Krukväxt Laura = new Palm ("Laura", 5);
        Krukväxt Meatloaf = new KöttätandeVäxt("Meatloaf", 0.7);
        Krukväxt Putte = new Palm("Putte", 1);

        List<Krukväxt> allaVäxter = new ArrayList();
        allaVäxter.add(Igge);
        allaVäxter.add(Laura);
        allaVäxter.add(Meatloaf);
        allaVäxter.add(Putte);

       String VäxtSomSkaHaVätska = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
       printServering(allaVäxter, VäxtSomSkaHaVätska);

    }
    public void printServering (List<Krukväxt> allaVäxter, String VäxtSomSkaHaVätska) {
        for (Krukväxt k : allaVäxter) {
            if (k.getNamn().equals(VäxtSomSkaHaVätska)) {
                JOptionPane.showMessageDialog(null, k.Servering());
                break;
            } else if (allaVäxter.indexOf(k) == allaVäxter.size() - 1)
                JOptionPane.showMessageDialog(null,"Greenest har ingen växt vid det namnet.");
        }
    }
}
