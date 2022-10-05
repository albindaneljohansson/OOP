package OOPInlämning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {
    Palm p = new Palm("Laura", 5);
    @Test
    void getNamn() {
        assert (p.getNamn().equals("Laura"));
        assert (!p.getNamn().equals("Lisa"));
    }

    @Test
    void getVätskeMängd() {
      assert (p.getVätskeMängd() == 2.5);
      assert (p.getVätskeMängd() != 2);
    }

    @Test
    void getvätskeTyp() {
        assert (p.getvätskeTyp().equals(Vätsketyp.KRANVATTEN));
        assert (!p.getvätskeTyp().equals(Vätsketyp.MINERALVATTEN));
    }

    @Test
    void servering() {
        assert (p.Servering().equals("Laura behöver 2.5 liter kranvatten per dag."));
        assert (!p.Servering().equals(""));
    }

   @Test
    void printMe() {
        assert (p.printMe().equals("Namn: Laura Höjd: 5.0 m Växttyp: Palm"));
        assert (!p.printMe().equals(""));
    }
}