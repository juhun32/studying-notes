package section02.superkeyword;

import java.util.Date;

public class ComputerDTO extends ProductDTO{
	
	/* computerDTO 클래스는 하나의 상품이다.
	 * ProductDTO 클래스를 상속받아 작성할 것이다.
	 * */
	
	private String cpu;
	private int hdd;
	private int ram;
	private String operationSystem;
	
	
	public ComputerDTO() {
		System.out.println("CompuerDTO 클래스의 기본 생성자를 호출함.");
	}
	
	public ComputerDTO(String cpu, int hdd, int ram, String operationSystem) {
		super();
		this.cpu =cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
		System.out.println("ComputerDTO 클래스의 모든 필드를 초기화 하는 생성자를 호출함");
	}
	
	public ComputerDTO(String code, String brand, String name, Date manufacturingDatem,
			String cpu, int hdd, String operationSystem) {
		super(code, brand, name, manufacturingDatem);
		this.cpu =cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
		System.out.println("computerDTO 클래스의 부모 필드도 초기화 하는 생성자를 호출함...");
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}

	@Override
	public String toString() {
		
//		
//		return "ComputerDTO [code = "+ super.getCode()
//				+ ", brand=" + super.getBrand()
//				+ ", name= " + super.getName()
//				+ ", manufacturingDate = " + super.getManuFacturingDate()
//				+ ", cpu=" + cpu 
//				+ ", hdd=" + hdd 
//				+ ", ram=" + ram 
//				+ ", operationSystem=" + operationSystem
//				+ "]";
		
		return "[ "+super.toString()
				+ ", cpu=" + cpu 
				+ ", hdd=" + hdd 
				+ ", ram=" + ram 
				+ ", operationSystem=" + operationSystem
				+ "]";
	}
	
	
	
}
