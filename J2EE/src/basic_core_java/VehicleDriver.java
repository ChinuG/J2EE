package basic_core_java;

public class VehicleDriver {
	public static void main(String args[])
	{
		Vehicle v = HelpVehicle.getVehicle();
		v.start();
	}
}
