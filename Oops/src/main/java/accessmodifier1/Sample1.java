package accessmodifier1;
public class Sample1 {
	 protected int a=3;
	protected void display()
	{
		System.out.println(a);
	}
public static void main(String args[])
{
	Sample1 obj=new Sample1();
	obj.display();
}
}
