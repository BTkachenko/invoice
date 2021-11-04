package faktura;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;

class CustomerTest {

	private Customer customer;
	List<Product> productList = new ArrayList<>();
	Seller testSeller;
	
	@Before
	public void setUp()
	{
		customer =new Customer("Jan", "Kowalski", 53534, "Jakis tam adres", 23,"Jakas tam firma");	
        testSeller = new Seller("Zabka",1234125,"53253253","Wroclaw,Plac Grunwaldzki");
        Product p = new Product("aa",150.0,18,23);
        productList.add(p);
         p = new Product("bb",100.0,18,23);
        productList.add(p);

        p = new Product("cc",200.0,8,23);
        productList.add(p);


	}
	@Test
	void addToBasketCorrect() {
		setUp();
		assertEquals(0,customer.getBasket().size());
		
		
		customer.addToBasket(productList.get(0), 1);
		assertEquals(1,customer.getBasket().size());
		Integer element = customer.getBasket().get(productList.get(0));
		Assert.assertNotNull(element);
		assertEquals(Integer.valueOf(1),element);
	
		customer.addToBasket(productList.get(0), 1);
		Integer element2 = customer.getBasket().get(productList.get(0));
		assertEquals(1,customer.getBasket().size());
		Assert.assertNotNull(element2);
		assertEquals(Integer.valueOf(2),element2);
		
		customer.addToBasket(productList.get(1), 1);
		Integer element3 = customer.getBasket().get(productList.get(0));
		assertEquals(2,customer.getBasket().size());
		Assert.assertNotNull(element3);
		assertEquals(Integer.valueOf(2),element3);
		
	}
	@Test
	public void removeFromBasketCorrect()
	{
		setUp();

	assertEquals(0,customer.getBasket().size());
	customer.addToBasket(productList.get(0), 1);
	assertEquals(1,customer.getBasket().size());
	customer.removeFromBasket(productList.get(0));
	assertEquals(0,customer.getBasket().size());

	}
	
	@Test
	public void toInvoiceCorrect()
	{
		setUp();
		Invoice invoice = customer.toInvoice(testSeller);
		customer.addToBasket(productList.get(0), 1);
		customer.addToBasket(productList.get(1), 1);
		Assert.assertNotNull(invoice);
	}

}
