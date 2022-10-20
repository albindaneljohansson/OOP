package OOP7;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cirkel c1 = new Cirkel(2, 3, 2.3);
        Cirkel c2 = new Cirkel(5, 6,4.5);
        LiksidigTriangel t1 = new LiksidigTriangel(2, 3,4,3);
        LiksidigTriangel t2 = new LiksidigTriangel(5, 6,4.5, 6);

        List<Figur> figurlista = new LinkedList<>();

        figurlista.add(c1);
        figurlista.add(c2);
        figurlista.add(t1);
        figurlista.add(t2);

        for (Figur f : figurlista){
            // System.out.printf(String.format(f.getClass().getSimpleName()+":\t"+ "%.2f", f.area())+"\n");
            System.out.printf(f.getClass().getSimpleName()+":\t"+ String.format("%.2f", f.area())+" m2"+"\n");

        }
    }
}
