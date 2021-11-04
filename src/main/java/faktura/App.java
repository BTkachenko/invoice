package faktura;

import java.util.*;

/**
 * Example
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Seller testSeller = new Seller("Zabka",1234125,"53253253","Wroclaw,Plac Grunwaldzki");
        Product testProd1 = new Product("Coca-cola 1l",5.0,18,80);
        Product testProd2 = new Product("Coca-cola 2l",10.0,18,180);
        Product testProd3 = new Product("Coca-cola 0.5l",3.0,18,120);
        Product testProd4 = new Product("Coca-cola 1.5l",7.0,18,140);
        List<Product> prodlist = new ArrayList<>(Arrays.asList(testProd1,testProd2,testProd3,testProd4));
        testSeller.setProductList(prodlist);
        Customer tc = new Customer("Jan", "Kowalski", 53534, "Jakis tam adres", 23,"Jakas tam firma");
        
        tc.addToBasket(testProd4, 1);
        tc.addToBasket(testProd2, 5);
        Invoice testInvoice =  tc.toInvoice(testSeller);
        testInvoice.printInvoice();
    }
}
