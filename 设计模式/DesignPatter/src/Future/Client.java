package Future;
/*
 * 返回Data对象，立刻返回FutureData，并且开启ClientThread线程装配ReadData
 * */
public class Client {
	public Data request(final String queryStr) {
		final FutureData futureData = new FutureData();
		new Thread() {
			public void run() {
				//RealData的构建很慢，所以在单独的线程中进行
				RealData realData = new RealData(queryStr);
				futureData.setRealData(realData);
			}
		}.start();
		return futureData;
	}
}
