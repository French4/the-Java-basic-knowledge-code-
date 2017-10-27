package abstractFactory;

public class LowFactory implements CarFactory{

	@Override
	public Engine createEngine() {
		return new LowEngine();
	}

	@Override
	public seat createSeat() {
		return new LowSeat();
	}

	@Override
	public Tyre createTyre() {
		return new LowTyre();
	}

}
