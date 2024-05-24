package presentation;

import dao.DaoImpl;
import ext.DaoImplV2;
import metier.MetieImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        /*
        Injection des dependences par instanciation statique
        */
        DaoImpl d = new DaoImpl();
        //DaoImplV2 d = new DaoImplV2();
        MetieImpl metier = new MetieImpl();// Injection via Constructor
        metier.setDao(d);
        System.out.println("Le résultat est : " +metier.calcul());

    }
}
