package abstractFactory;

public interface CarFactory {
	Engine createEngine();
	seat createSeat();
	Tyre createTyre();
}
