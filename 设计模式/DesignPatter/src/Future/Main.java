package Future;
/*
 * ϵͳ���ã�����Client��������
 * */
public class Main {
	public static void main(String[] args) {
		Client client = new Client();
		//������������أ���Ϊ�õ���FutureData������RealData
		Data data = client.request("name");
		System.out.println("�������");
		try {
			//���������һ��sleep�����˶�����ҵ��Ĵ���
			//�ڴ���ҵ����߼��У�RealData���������Ӷ���������˵ȴ�ʱ��
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ʹ����ʵ������
		System.out.println("���� = "+data.getResult());
	}
}
