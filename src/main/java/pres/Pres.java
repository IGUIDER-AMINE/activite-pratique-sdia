package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres {
    public static void main(String[] args) {
        //instanciation statique(on utiliser des new,class) => L'app n'est pas ferme à la modification
        DaoImpl d = new DaoImpl();
        //Injection de dépendances
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d);
        System.out.println("Res="+metier.calcul());
    }
}
