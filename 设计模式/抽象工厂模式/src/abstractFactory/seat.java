package abstractFactory;

public interface seat {
	void massage();
}

class LuxurySeat implements seat{

	@Override
	public void massage() {
		System.out.println("�����Զ���Ħ");
	}
	
}

class LowSeat implements seat{

	@Override
	public void massage() {
		System.out.println("�������Զ���Ħ");
	}
	
}

