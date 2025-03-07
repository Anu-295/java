package aggression;

public class Student {
	String name;int rollno;
	Address add;
	public Student(String name,int rollno,Address add)
	{
		this.add=add;
		this.name=name;
		this.rollno=rollno;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(add.housename);
		System.out.println(add.city);
		System.out.println(add.pin);
	}

	public static void main(String[] args) {
		Address obj=new Address("Parappuram","Ekm",663332);
		Student obj1=new Student("Anu",32,obj);
		obj1.display();
		

	}

}
