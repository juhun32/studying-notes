package test;

import java.util.Date;

public class Order {
	/* A라는 사용자가 제품 커피를 주문하였다.
	 * 우리가 취급해야 하는데이터는 다음과 같다.
	 * 
	 * 1. 사용자 번호
	 * 2. 제품명
	 * 3. 제품가격
	 * 4. 주문시간
	 * */
	
	private int userNum;
	private String productName;
	private int price;
	private Date orderTime;
	
	public Order() {
		System.out.println("기본 생성자를 생성함");
	}
	
	
	public Order(int userNum, String productName, int price, Date orderTime) {
		this.userNum = userNum;
		this.productName = productName;
		this.price = price;
		this.orderTime = orderTime;
	}


	public int getUserNum() {
		return userNum;
	}
	
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	
	
	@Override
	public String toString() {
		return "Order [userNum=" + userNum + ", productName=" + productName + ", price=" + price + ", orderTime="
				+ orderTime + "]";
	}
	
	

}
