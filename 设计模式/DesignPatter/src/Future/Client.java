package Future;
/*
 * ����Data�������̷���FutureData�����ҿ���ClientThread�߳�װ��ReadData
 * */
public class Client {
	public Data request(final String queryStr) {
		final FutureData futureData = new FutureData();
		new Thread() {
			public void run() {
				//RealData�Ĺ��������������ڵ������߳��н���
				RealData realData = new RealData(queryStr);
				futureData.setRealData(realData);
			}
		}.start();
		return futureData;
	}
}
