package OOPInlämning1;

public abstract class Krukväxt {
    private String namn;
    private double höjdiMeter;

    public Krukväxt(String namn, double höjdiMeter) {  // inkapsling
        if (!namn.isEmpty() && höjdiMeter > 0) {     // Kontroll att inmatade värden är korrekta
            this.namn = namn;
            this.höjdiMeter = höjdiMeter;
        }
        else {
            System.out.println("Felaktig inmatning");
        }
    }

    public String getNamn() { // inkapsling - Polymorfism
        return namn;
    }

    public void setNamn(String namn) { // inkapsling
        this.namn = namn;
    }

    public double getLängd() { // inkapsling
        return höjdiMeter;
    }

    public void setLängd (double höjdiMeter) { // inkapsling - När plantan växer
        this.höjdiMeter = höjdiMeter;
    }

    public abstract String Servering(); // Polymorfism
}
