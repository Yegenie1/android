package report;

class Posfic extends TV{			//Ŭ���� ���_�ڽ�Ŭ����

	void getResolution() {			//TVŬ������ �߻�޼ҵ��� getResolution ����
		System.out.println("Posfic TV�ػ󵵴� 3,840 x 2,160");
	}
	
	Posfic(String name,String size){
		this.name=name;				//������
		this.size=size;				//������
	}
	
	Posfic(String name){			//�޼ҵ� �����ε�
		this.name=name;	
	}
	
	Posfic(){						//�޼ҵ� �����ε�
		
	}
	int getreview() {
		return review;
		
	}
	void ReviewNum(int value) {		//TVŬ������ ReviewNum�� �������̵�
		if(review +value>=999)
			review =999;
		else
			review += (int)value;
	}
}
