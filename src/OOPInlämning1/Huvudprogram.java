package OOPInlämning1;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Huvudprogram {

    public static void main(String[] args) {
        Huvudprogram h1 = new Huvudprogram();
    }
    public Huvudprogram(){

        Krukväxt Igge = new Kaktus ("Igge", 0.2);
        Krukväxt Laura = new Palm ("Laura", 5);
        Krukväxt Meatloaf = new KöttätandeVäxt("Meatloaf", 0.7);
        Krukväxt Putte = new Palm("Putte", 1);

        List<Krukväxt> allaVäxter = new ArrayList();
        allaVäxter.add(Igge);
        allaVäxter.add(Laura);
        allaVäxter.add(Meatloaf);
        allaVäxter.add(Putte);

        int i = 1;

        String VäxtSomSkaHaVätska = JOptionPane.showInputDialog("Vilken växt ska få vätska?");

        if (VäxtSomSkaHaVätska != null) {
            i = printServering(allaVäxter, VäxtSomSkaHaVätska);
        }

        while (i == 0) {
            VäxtSomSkaHaVätska = JOptionPane.showInputDialog("Greenest har ingen " +
                    "växt vid det namnet.\n Vilken växt ska få vätska?");
            if (VäxtSomSkaHaVätska == null) {
                break;
            }
            i = printServering(allaVäxter, VäxtSomSkaHaVätska);
        }
    }
    public int printServering (List<Krukväxt> allaVäxter, String VäxtSomSkaHaVätska) {
        for (Krukväxt k : allaVäxter) {
            if (k.getNamn().equals(VäxtSomSkaHaVätska)) {
                JOptionPane.showMessageDialog(null, k.Servering());
                return 1;
            }
        }
        return 0;
    }
}
