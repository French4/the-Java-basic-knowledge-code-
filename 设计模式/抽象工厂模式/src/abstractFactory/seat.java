package abstractFactory;

public interface seat {
	void massage();
}

class LuxurySeat implements seat{

	@Override
	public void massage() {
		System.out.println("可以自动按摩");
	}
	
}

class LowSeat implements seat{

	@Override
	public void massage() {
		System.out.println("不可以自动按摩");
	}
	
}

