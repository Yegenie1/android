package report;

class Samsung extends TV{			//Ŭ���� ���_�ڽ�Ŭ����
	static int sizeNum =0;			//�����ʵ�
	
	void getResolution() {			//TVŬ������ �߻�޼ҵ��� getResolution ����
		System.out.println("Samsung TV�ػ󵵴� 7,680 x 4,320");
	}
	static int currentsizeNum() {	//�����޼ҵ� ����
		return sizeNum;
		
	}
	Samsung(String name,String size){//�޼ҵ� �����ε�
		this.name=name;				//������
		this.size=size;				//������
		sizeNum++;					//�����ʵ� �ϳ��� ����
		
	}
	
	Samsung(String name){			//�޼ҵ� �����ε�
		this.name=name;	
	}
	
	Samsung(){						//�޼ҵ� �����ε�
		
	}
}
