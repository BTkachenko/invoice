package faktura;

public class Product {
	private String productName;
	private double productPrice;
	private double productTax;
	private int productQuantity;
	
	
	public Product(String productName, double productPrice, double productTax,
			int productQuantity) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productTax = productTax;
		this.productQuantity = productQuantity;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}



	public double getProductTax() {
		return productTax;
	}


	public void setProductTax(double productTax) {
		this.productTax = productTax;
	}


	public int getProductQuantity() {
		return productQuantity;
	}


	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	
	
	

}
