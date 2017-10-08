package Future;
/*
 * 真实数据，构造是比较慢
 * */
public class RealData implements Data{

	protected String result = null;
	public RealData(String para) {
		
		//RealData构造很慢，这里使用sleep模拟
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 10; i++) {
			sb.append(para);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result = sb.toString();
	}
	@Override
	public String getResult() {
		return result;
	}
}
