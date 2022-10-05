package OOPInlämning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeVäxtTest {

    KöttätandeVäxt k = new KöttätandeVäxt("Meatloaf", 0.7);
    @Test
    void getNamn() {
        assert (k.getNamn().equals("Meatloaf"));
        assert (!k.getNamn().equals("Laura"));
    }

    @Test
    void getVätskeMängd() {
        assert (k.getVätskeMängd() == 0.24);
        assert (k.getVätskeMängd() != 2);
    }

    @Test
    void getvätskeTyp() {
        assert (k.getvätskeTyp().equals(Vätsketyp.PROTEINDRYCK));
        assert (!k.getvätskeTyp().equals(Vätsketyp.MINERALVATTEN));
    }

    @Test
    void servering() {
        assert (k.Servering().equals("Meatloaf behöver 0.24 liter proteindryck per dag."));
        assert (!k.Servering().equals(""));
    }

    @Test
    void printMe() {
        assert (k.printMe().equals("Namn: Meatloaf Höjd: 0.7 m Växttyp: KöttätandeVäxt"));
        assert (!k.printMe().equals(""));
    }
}