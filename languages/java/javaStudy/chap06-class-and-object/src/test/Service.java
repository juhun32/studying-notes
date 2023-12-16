package test;

import java.util.Date;

public class Service {

	/* 고객은 주문된 커피가 언제 완성되는지 궁금해 한다.
	 *	그래서 서비스 차원에서 조리 예상 완료시간을 알려주고자 한다.
	 *	목록은 다음과 같다.
	 * 
	 * 1. 사용자 번호
	 * 2. 제품명
	 * 3. 주문 시간
	 * 4. 예상 완료시간
	 * 5. 소요시간
	 * 6. 제품 상태
	 * */
	
	private int userNo;
	private String productName;
	private Date orderTime;
	private Date expectationTime;
	private Date takenTime;
	private char productSate;
	
	public Service() {

	}
	
	public Service(int userNo, String productName, Date orderTime, Date expectationTime, Date takenTime,
			char productSate) {
		this.userNo = userNo;
		this.productName = productName;
		this.orderTime = orderTime;
		this.expectationTime = expectationTime;
		this.takenTime = takenTime;
		this.productSate = productSate;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Date getExpectationTime() {
		return expectationTime;
	}

	public void setExpectationTime(Date expectationTime) {
		this.expectationTime = expectationTime;
	}

	public Date getTakenTime() {
//		takenTime = orderTime - expectationTime;
		return takenTime;
	}

	public char getProductSate() {
		return productSate;
	}

	public void setProductSate(char productSate) {
		this.productSate = productSate;
	}

	@Override
	public String toString() {
		return "Service [userNo=" + userNo + ", productName=" + productName + ", orderTime=" + orderTime
				+ ", expectationTime=" + expectationTime + ", takenTime=" + takenTime + ", productSate=" + productSate
				+ "]";
	}
	
	
	
	
}
