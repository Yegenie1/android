package report;

class Posfic extends TV{			//클래스 상속_자식클래스

	void getResolution() {			//TV클래스의 추상메소드인 getResolution 구현
		System.out.println("Posfic TV해상도는 3,840 x 2,160");
	}
	
	Posfic(String name,String size){
		this.name=name;				//생성자
		this.size=size;				//생성자
	}
	
	Posfic(String name){			//메소드 오버로딩
		this.name=name;	
	}
	
	Posfic(){						//메소드 오버로딩
		
	}
	int getreview() {
		return review;
		
	}
	void ReviewNum(int value) {		//TV클래스의 ReviewNum를 오버라이딩
		if(review +value>=999)
			review =999;
		else
			review += (int)value;
	}
}
