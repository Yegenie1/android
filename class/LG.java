package report;

class LG extends TV{					//Ŭ���� ���_�ڽ�Ŭ����

	final static int MAXDISCOUNT =120;	//����ʵ�
	final static int MINDISCOUNT = 0;	//����ʵ�	
	
	void getResolution() {				//TVŬ������ �߻�޼ҵ��� getResolution ����
		System.out.println("LG TV�ػ󵵴� 7,680 x 4,320");
	}
	
	LG(String name,String size){
		this.name=name;					//������
		this.size=size;					//������
		
	}
	
	LG(String name){					//�޼ҵ� �����ε�
		this.name=name;	
	}
	
	LG(){								//�޼ҵ� �����ε�
		
	}
	
}
