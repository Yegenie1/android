package report;

abstract class TV { 				//�߻�Ŭ����_�θ�Ŭ����
	String Company;					//ȸ��
	String name;					//��ǰ��
	String size;					//������
	int review=0;					//����
	abstract void getResolution(); 	//�߻�޼ҵ� �ػ� ����
	
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

