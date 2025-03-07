package Inheritance;

public class Puppy extends Dog {
	public void sleep()
	{
		System.out.println("Puppy is sleeping");
	}

	public static void main(String[] args) {
		System.out.println("I have 3 classe");
		
Puppy obj=new Puppy();
obj.eat();
obj.bark();
obj.sleep();
	}

}
