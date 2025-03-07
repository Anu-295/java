package inheritanceHierarchical;

public class Bike extends Vehicles{
	public void colour()
	{
		System.out.println("Colour of bike is metalic red");
	}
	public static void main(String args[])
	{
		Bike obj=new Bike();
		obj.speed();
		obj.colour();
		System.out.println("my vehicle");
		Car obj1=new Car();
	}

}
