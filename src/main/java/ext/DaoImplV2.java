package ext;

import dao.IDao;

public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version Web Service .");
        double temperature = 11;
        return temperature;
    }
}
