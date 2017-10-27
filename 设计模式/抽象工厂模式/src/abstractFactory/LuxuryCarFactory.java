package abstractFactory;

public class LuxuryCarFactory implements CarFactory{

	@Override
	public Engine createEngine() {
		return new LuxuryEngine();
	}

	@Override
	public seat createSeat() {
		return new LuxurySeat();
	}

	@Override
	public Tyre createTyre() {
		return new LuxuryTyre();
	}

}
