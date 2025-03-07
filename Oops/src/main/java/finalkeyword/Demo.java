package finalkeyword;

public final class Demo {
final int age;
public Demo()
{
	age=30;
	System.out.println("print age");
}
public final void display()
{
	//age=40; shows error 
	System.out.println("age is");
}
}
