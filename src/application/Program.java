package application;

import model_dao.DaoFactory;
import model_dao.SellerDao;
import model_entities.Departament;
import model_entities.Seller;

import java.util.Date;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        SellerDao sellerDao = DaoFactory.creatSellerDao();
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
