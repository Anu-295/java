package superkeyword;

public class Child extends Parent {
	String colour="white";
	public Child()
	{
		super();
		System.out.println("child class constructor");
	}
	public void display()
	{
		System.out.println("child class method");
		super.display();
		System.out.println(colour);
		System.out.println(super.colour);
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();

	}

}
