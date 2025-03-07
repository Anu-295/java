package polymorphism;

public class Child extends Parent {
	public void sum(int a,int b)
	{
		int s=a+b;
		super.sum(10, 10);
		System.out.println("child class sum: "+s);
		
	}

	public static void main(String[] args) {
		
Parent obj=new Parent();
obj.sum(30, 30);
	}

}
