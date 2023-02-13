package report;

class LG extends TV{					//클래스 상속_자식클래스

	final static int MAXDISCOUNT =120;	//상수필드
	final static int MINDISCOUNT = 0;	//상수필드	
	
	void getResolution() {				//TV클래스의 추상메소드인 getResolution 구현
		System.out.println("LG TV해상도는 7,680 x 4,320");
	}
	
	LG(String name,String size){
		this.name=name;					//생성자
		this.size=size;					//생성자
		
	}
	
	LG(String name){					//메소드 오버로딩
		this.name=name;	
	}
	
	LG(){								//메소드 오버로딩
		
	}
	
}
