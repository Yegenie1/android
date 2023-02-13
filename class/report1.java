package report;

public class report1 {

	public static void main(String[] args) {
		Samsung samsung1 = new Samsung("Neo QLED 4K","163cm"); 		//인스턴스
		Samsung samsung2 = new Samsung("Neo QLED 4K","189cm");		//인스턴스
		Samsung samsung3 = new Samsung("Neo QLED 4K","214cm");		//인스턴스
		LG lg1 = new LG("LG QNED","189cm");							//인스턴스
		Posfic posfic1 = new Posfic("750HDR Google AI-M","189cm ");	//인스턴스
		
		samsung1.getResolution();		//추상메소드 해상도
		System.out.println( "상품명은 " +samsung1.getName()+
				", 사이즈는 " + samsung1.getSize() + 
				", 해당 상품의 사이즈는 " + Samsung.currentsizeNum() + "가지입니다.");//정적메소드
		lg1.getResolution();			//추상메소드 해상도
		System.out.println( "상품명은 " +lg1.getName()+
				", 사이즈는 " + lg1.getSize() + 
				", 최대할인금액은 "+ LG.MAXDISCOUNT +"만원입니다.");	//상수필드
		posfic1.getResolution();		//추상메소드 해상도
		posfic1.ReviewNum(167);			//오버라이딩한 리뷰수
		System.out.println( "상품명은 " +posfic1.getName()+
				", 사이즈는 " + posfic1.getSize() + 
				", 리뷰수는 " + posfic1.getreview() + "개입니다.");
	}

}
