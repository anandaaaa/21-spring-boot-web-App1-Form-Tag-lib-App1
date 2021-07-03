package in.anand.beans;

import java.beans.JavaBean;


public class product {
	
private Integer productId;
private String productName;
private Double productCost;
public Integer getProductId() {
	return productId;
}
public void setProductId(Integer productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public Double getProductCost() {
	return productCost;
}
public void setProductCost(Double productCost) {
	this.productCost = productCost;
}
@Override
public String toString() {
	return "product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost + "]";
}


	
}
