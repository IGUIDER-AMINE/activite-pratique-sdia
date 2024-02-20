package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier") // demandez à spring au démarrage créé un objet de cette class avec le nom metier
public class MetierImpl implements IMetier {
    //pas recommande @Autowired , utiliser la constructeur
    //@Autowired // inject , au moment de la création d'un objet de MetierImpl,injecte-moi(affecte-moi) dans cette variable un objet de type IDao
    private IDao dao;

    public MetierImpl(@Qualifier("dao") IDao dao) {
        this.dao = dao;
    }

    //injection des dépendances via le constructeur il faudrait avoir un seul constructeur=> constructeur avec parameter
    /*public MetierImpl() {}*/

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 23;
        return res;
    }

    public void setDao(IDao dao){
        this.dao=dao;
    }
}
