package abstaction;

public class Child extends Sample {
	public void show()
	{
		System.out.println("Abstract class implemented in child");
	}
public void print()
{
	System.out.println("Method of child class");
}
	public static void main(String[] args) {
	Child c=new Child();
	c.show();
	c.display();
	c.print();

	}

}
