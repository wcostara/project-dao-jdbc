package application;

import model_entities.Departament;
import model_entities.Seller;

import java.util.Date;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Departament obj = new Departament(1, "Books");
        Seller sell = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);

        System.out.println(sell);
    }
}
