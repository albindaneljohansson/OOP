package OOPInlämning1;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Huvudprogram {

    public static void main(String[] args) {
        Huvudprogram h1 = new Huvudprogram();
    }
    public Huvudprogram(){

        Data data = new Data();
        List<Krukväxt> allaVäxter = data.växtLista();
        String VäxtSomSkaHaVätska = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
        int i = 1;

        if (VäxtSomSkaHaVätska != null) {   // För att avbryta programmet vid cancel
            i = printServering(allaVäxter, VäxtSomSkaHaVätska);
        }

        while (i == 0) {                        // Loopar till ett namn som finns på listan är valt
            VäxtSomSkaHaVätska = JOptionPane.showInputDialog("Greenest har ingen " +
                    "växt vid det namnet.\n Vilken växt ska få vätska?");
            if (VäxtSomSkaHaVätska == null) {
                break;                             // För att avbryta programmet vid cancel
            }
            i = printServering(allaVäxter, VäxtSomSkaHaVätska);
        }
    }
    public int printServering (List<Krukväxt> allaVäxter, String VäxtSomSkaHaVätska) {
        for (Krukväxt k : allaVäxter) {                                          //Kollar om växten finns i listan
            if (k.getNamn().equals(VäxtSomSkaHaVätska)) {                       //Anropar serveringsmetod om växt finns
                JOptionPane.showMessageDialog(null, k.Servering());
                return 1;
            }                                                                       //Returnerar int för ja/nej
        }
        return 0;
    }
}
