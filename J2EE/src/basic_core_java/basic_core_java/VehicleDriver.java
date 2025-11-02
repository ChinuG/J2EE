package basic_core_java;

public class VehicleDriver {
	public static void main(String args[])
	{
		Vehicle v = HelpVehicle.getVehicle();
		Engine e = v.getEngine();
		e.startEngine();
		v.start();
	}
}
