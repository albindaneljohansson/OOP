package OOPInlämning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusTest {

    Kaktus k = new Kaktus("Igge", 0.2);
    @Test
    void getNamn() {
        assert (k.getNamn().equals("Igge"));
        assert (!k.getNamn().equals("Lisa"));
    }

    @Test
    void getVätskeMängd() {
        assert (k.getVätskeMängd() == 0.02);
        assert (k.getVätskeMängd() != 2);
    }

    @Test
    void getvätskeTyp() {
        assert (k.getvätskeTyp().equals(Vätsketyp.MINERALVATTEN));
        assert (!k.getvätskeTyp().equals(Vätsketyp.KRANVATTEN));
    }

    @Test
    void servering() {
        assert (k.Servering().equals("Igge behöver 0.02 liter mineralvatten per dag."));
        assert (!k.Servering().equals(""));
    }

    @Test
    void printMe() {
        assert (k.printMe().equals("Namn: Igge Höjd: 0.2 m Växttyp: Kaktus"));
        assert (!k.printMe().equals(""));
    }
}