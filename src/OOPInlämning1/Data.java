package OOPInlämning1;

import java.util.ArrayList;
import java.util.List;

public class Data {


        Krukväxt Igge = new Kaktus("Igge", 0.2);
        Krukväxt Laura = new Palm("Laura", 5);
        Krukväxt Meatloaf = new KöttätandeVäxt("Meatloaf", 0.7);
        Krukväxt Putte = new Palm("Putte", 1);

        public List<Krukväxt> växtLista() {
            List<Krukväxt> allaVäxter = new ArrayList();
            allaVäxter.add(Igge);
            allaVäxter.add(Laura);
            allaVäxter.add(Meatloaf);
            allaVäxter.add(Putte);
            return allaVäxter;
        }

}
