package dao;

import org.springframework.stereotype.Component;

//- Version annotations
@Component("dao") // demandez à spring au démarrage créé un objet de cette class avec le nom dao
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de données");
        double temp = 25;
        return temp;
    }
}
