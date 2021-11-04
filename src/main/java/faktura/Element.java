package faktura;

public class Element {
	private String productName;
	private int productQuantity;
	private double priceNet;
	private double priceAmount;
	private double tax;
	private double priceGross;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public double getPriceNet() {
		return priceNet;
	}
	public void setPriceNet(double priceNet) {
		this.priceNet = priceNet;
	}
	public double getPriceAmount() {
		return priceAmount;
	}
	public void setPriceAmount(double priceAmount) {
		this.priceAmount = priceAmount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getPriceGross() {
		return priceGross;
	}
	public void setPriceGross(double priceGross) {
		this.priceGross = priceGross;
	}
}
