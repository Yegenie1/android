package report;

class Samsung extends TV{			//클래스 상속_자식클래스
	static int sizeNum =0;			//정적필드
	
	void getResolution() {			//TV클래스의 추상메소드인 getResolution 구현
		System.out.println("Samsung TV해상도는 7,680 x 4,320");
	}
	static int currentsizeNum() {	//정적메소드 정의
		return sizeNum;
		
	}
	Samsung(String name,String size){//메소드 오버로딩
		this.name=name;				//생성자
		this.size=size;				//생성자
		sizeNum++;					//정적필드 하나씩 증가
		
	}
	
	Samsung(String name){			//메소드 오버로딩
		this.name=name;	
	}
	
	Samsung(){						//메소드 오버로딩
		
	}
}
