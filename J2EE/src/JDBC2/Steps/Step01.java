package com.crud.CrudOperation;

public class Step01 {
	public static void main(String args[])
	{
		
		try {
			//	Step 01 - Load Or Register the driver.
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded Successfully..");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
