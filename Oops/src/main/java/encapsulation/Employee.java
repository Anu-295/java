package encapsulation;

public class Employee {
	private String name;private int salary;private String desig;
public void setter(String name,int salary,String desig)
{
this.name=name;
this.salary=salary;
this.desig=desig;
}
public void getter()
{
	System.out.println("Name: "+name);
	System.out.println("Salary: "+salary);
	System.out.println("Designation: "+desig);
}
}
