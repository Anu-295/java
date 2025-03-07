package inheritanceHierarchical;

public class Car extends Vehicles {
public void milage()
{
	System.out.println("car has less milage");
}
public static void main(String args[])
{Car obj1=new Car();
	obj1.milage();
	obj1.speed();
}
}
