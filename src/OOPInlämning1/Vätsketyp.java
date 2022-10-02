package OOPInlämning1;

public enum Vätsketyp {
    KRANVATTEN("kranvatten"),
    PROTEINDRYCK("proteindryck"),
    MINERALVATTEN("mineralvatten");

    public final String vätska;

    Vätsketyp(String s){
        vätska=s;
    }
}
