package report;

abstract class TV { 				//추상클래스_부모클래스
	String Company;					//회사
	String name;					//제품명
	String size;					//사이즈
	int review=0;					//리뷰
	abstract void getResolution(); 	//추상메소드 해상도 정보
	
	String getName() {
		return name;
	}
	
	String getSize() {
		return size;
	}
	
	int getreview() {
		return review;
	}
	
	void ReviewNum(int value) {
		if(review + value>=100)
			review =100;
		else
			review += (int)value;
	}

}

