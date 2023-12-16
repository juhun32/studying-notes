package section02.superkeyword;

import java.util.Date;

public class ProductDTO {

	private String code;
	private String brand;
	private String name;
	private Date ManuFacturingDate;
	
	public ProductDTO() {
		System.out.println("productDTO 클래스의 기본생성자 호출함....");
	}

	public ProductDTO(String code, String brand, String name, Date manuFacturingDate) {
		/* 아무 클래스도 상속받지 않았는데 super()가 호출된다.
		 * java.lang.Object 클래스의 생성자를 호출하기 때문이다.
		 * 모든 클래스는 object 클래스의 후손이기 때문이다.
		 * */
		super();
		this.code = code;
		this.brand = brand;
		this.name = name;
		ManuFacturingDate = manuFacturingDate;
		System.out.println("productDTO 클래스의 매개변수 있는 생성자 호출함....");
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getManuFacturingDate() {
		return ManuFacturingDate;
	}

	public void setManuFacturingDate(Date manuFacturingDate) {
		ManuFacturingDate = manuFacturingDate;
	}

	@Override
	public String toString() {
		return "ProductDTO [code=" + code + ", brand=" + brand + ", name=" + name + ", ManuFacturingDate="
				+ ManuFacturingDate + "]";
	}
	
}
