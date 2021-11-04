package faktura;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer {
	private String customerName;
	private String customerSurName;
	private long customerNIP;
	private String customerAdres;
	private double customerTax;
	private String customerCompany;
	private Seller s;
	Map<Product,Integer> basket;
	
	

	public Customer(String customerName, String customerSurName, int customerNIP, String customerAdres,
			double customerTax, String customerCompany) {
		super();
		this.customerName = customerName;
		this.customerSurName = customerSurName;
		this.customerNIP = customerNIP;
		this.customerAdres = customerAdres;
		this.customerTax = customerTax;
		this.customerCompany = customerCompany;
		basket = new HashMap();
	}
	
	public Invoice toInvoice(Seller s)
	{
		this.s = s;
		List<Element> elements = new ArrayList<>();
		Invoice i = new Invoice(this);
		Date date = new Date();
		SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		i.setInvoiceDate(date);
		i.getInvoiceNumber();
		
		
		for(Map.Entry<Product,Integer> entry: basket.entrySet()) {
			Element e = new Element();
			e.setProductQuantity(entry.getValue().intValue());
			e.setProductName(entry.getKey().getProductName());
			e.setPriceAmount(entry.getKey().getProductPrice());
			e.setPriceNet(entry.getKey().getProductPrice()*e.getProductQuantity());
			e.setTax(entry.getKey().getProductTax()/100.0);
			
			double gross = e.getPriceNet()+(e.getPriceNet()*e.getTax());
			
			e.setPriceGross(gross);
			
			elements.add(e);
			
		}
		i.setElements(elements);
		return i;
	}

	public Map<Product, Integer> getBasket() {
		return basket;
	}

	public Seller getS() {
		return s;
	}
	
	public void addToBasket(Product p,int prodNum)
	{
		Integer el = basket.get(p);
		if(el != null)
			basket.replace(p,el+prodNum);
		else if (el == null)
			basket.put(p, prodNum);
	}
	
	public void removeFromBasket(Product p)
	{
		basket.remove(p);
	}

	@Override
	public String toString() {
		return  customerName + " " + customerSurName + " NIP: "
				+ customerNIP + ",Adres: " + customerAdres + " , Company: " + customerCompany +"\n";
	}
	
	
	
}
