package factoryMethod;

public class bydFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new Audi();
	}

}
