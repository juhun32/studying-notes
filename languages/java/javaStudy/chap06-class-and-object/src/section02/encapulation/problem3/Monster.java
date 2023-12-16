package section02.encapulation.problem3;

public class Monster {
	
//	String name;
	String kind;
	int hp;
	
	public void setInfo(String info) {
		this.kind = info;
	}
	
	public void setHp(int hp) {
		if(hp>0) {
			this.hp = hp;
		}else {
			System.out.println("hp는 0보다 작을 수 없습니다. \n 0으로 초기화 합니다.");
			this.hp = 0;
		}
	}
	
	public String getInfo() {
		return "몬스터의 이름은 " + this.kind+"이고, 체력은 " + this.hp+" 입니다.";
	}
	
}
