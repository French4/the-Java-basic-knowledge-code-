package Future;
/*
 * 系统调用，调用Client发出请求
 * */
public class Main {
	public static void main(String[] args) {
		Client client = new Client();
		//这里会立即返回，因为得到是FutureData，不是RealData
		Data data = client.request("name");
		System.out.println("请求完毕");
		try {
			//这里可以用一个sleep代替了对其他业务的处理
			//在处理业务的逻辑中，RealData被创建，从而充分利用了等待时间
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//使用真实的数据
		System.out.println("数据 = "+data.getResult());
	}
}
