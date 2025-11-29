package basic_core_java;

public class HelpVehicle {
	public static Vehicle getVehicle()
	{
		return new Bike(); // UpCasted
	}
}
