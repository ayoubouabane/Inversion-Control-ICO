package metier;

import dao.IDao;

public class MetieImpl implements IMetier{
    // Couplage faible
    private IDao dao;

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t*23;
        return res;
    }
    public MetieImpl() {
    }
    public MetieImpl(IDao dao) {
        this.dao = dao;
    }

    // Injecter dans la variable DAO
    public void setDao(IDao dao) {
        this.dao = dao;
    }


    // Injectio using Constructor
}
