package basic_core_java;

public class Bike implements Vehicle{
	@Override
	public void start()
	{
		System.out.println("Bike Started");
	}
	
	@Override
	public Engine getEngine()
	{
		return new BikeEngine();
	}
}
