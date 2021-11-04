package faktura;
import java.util.List;

public class Seller {
	private String sellerName;
	private long sellerNIP;
	private String sellerBankNumber;
	private String sellerAdres;
	private List<Product> productList;
	
	public void addProduct(Product p){
		productList.add(p);
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public long getSellerNIP() {
		return sellerNIP;
	}
	public void setSellerNIP(int sellerNIP) {
		this.sellerNIP = sellerNIP;
	}
	public String getSellerBankNumber() {
		return sellerBankNumber;
	}
	public void setSellerBankNumber(String sellerBankNumber) {
		this.sellerBankNumber = sellerBankNumber;
	}
	public String getSellerAdres() {
		return sellerAdres;
	}
	public void setSellerAdres(String sellerAdres) {
		this.sellerAdres = sellerAdres;
	}
	
	public Seller() {}
	
	public Seller(String sellerName, int sellerNIP, String sellerBankNumber, String sellerAdres) {
		this.sellerName = sellerName;
		this.sellerNIP = sellerNIP;
		this.sellerBankNumber = sellerBankNumber;
		this.sellerAdres = sellerAdres;
	}
	@Override
	public String toString() {
		return  sellerName + ", NIP: " + sellerNIP + ", BankNumber: "
				+ sellerBankNumber + ", Adres: " + sellerAdres ;
	}
	
	
	
}
