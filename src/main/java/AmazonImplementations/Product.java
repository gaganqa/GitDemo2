package AmazonImplementations;

import java.util.ArrayList;
import java.util.List;

;

public class Product {
	private String productName;
	private int price;
	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public List<String> getproductList(){
		List<String> productList = new ArrayList<>();
		productList.add("apple mac book pro");
		productList.add("apple mac book air");
		productList.add("iphone 17");
		return productList ;
		
			}   

}
