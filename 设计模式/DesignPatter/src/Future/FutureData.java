package Future;
/*
 * FutureData是RealData的包装。
 * */
public class FutureData implements Data {

	protected RealData realdata = null;
	protected boolean isReady = false;
	
	public synchronized void setRealData(RealData realData) {
		if(isReady)
			return;
		this.realdata = realData;
		isReady = true;
		notifyAll();  //RealData已经被注入，通知getResult()
	}
	
	public synchronized String getResult() {
		while(!isReady) { 			//一直等待RealData构造完成
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
