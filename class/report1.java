package report;

public class report1 {

	public static void main(String[] args) {
		Samsung samsung1 = new Samsung("Neo QLED 4K","163cm"); 		//�ν��Ͻ�
		Samsung samsung2 = new Samsung("Neo QLED 4K","189cm");		//�ν��Ͻ�
		Samsung samsung3 = new Samsung("Neo QLED 4K","214cm");		//�ν��Ͻ�
		LG lg1 = new LG("LG QNED","189cm");							//�ν��Ͻ�
		Posfic posfic1 = new Posfic("750HDR Google AI-M","189cm ");	//�ν��Ͻ�
		
		samsung1.getResolution();		//�߻�޼ҵ� �ػ�
		System.out.println( "��ǰ���� " +samsung1.getName()+
				", ������� " + samsung1.getSize() + 
				", �ش� ��ǰ�� ������� " + Samsung.currentsizeNum() + "�����Դϴ�.");//�����޼ҵ�
		lg1.getResolution();			//�߻�޼ҵ� �ػ�
		System.out.println( "��ǰ���� " +lg1.getName()+
				", ������� " + lg1.getSize() + 
				", �ִ����αݾ��� "+ LG.MAXDISCOUNT +"�����Դϴ�.");	//����ʵ�
		posfic1.getResolution();		//�߻�޼ҵ� �ػ�
		posfic1.ReviewNum(167);			//�������̵��� �����
		System.out.println( "��ǰ���� " +posfic1.getName()+
				", ������� " + posfic1.getSize() + 
				", ������� " + posfic1.getreview() + "���Դϴ�.");
	}

}
