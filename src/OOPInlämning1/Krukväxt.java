package OOPInlämning1;

public abstract class Krukväxt {
    private String namn;
    private double längd;

    public Krukväxt(String namn, double längd) {
        this.namn = namn;
        this.längd = längd;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public double getLängd() {
        return längd;
    }

    public void setLängd(double längd) {
        this.längd = längd;
    }

    public abstract String Servering();
}
