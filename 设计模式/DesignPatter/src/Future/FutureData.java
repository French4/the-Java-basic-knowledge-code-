package Future;
/*
 * FutureData��RealData�İ�װ��
 * */
public class FutureData implements Data {

	protected RealData realdata = null;
	protected boolean isReady = false;
	
	public synchronized void setRealData(RealData realData) {
		if(isReady)
			return;
		this.realdata = realData;
		isReady = true;
		notifyAll();  //RealData�Ѿ���ע�룬֪ͨgetResult()
	}
	
	public synchronized String getResult() {
		while(!isReady) { 			//һֱ�ȴ�RealData�������
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return realdata.getResult();
	}
}
