package aggressionexample;

public class College {
	String name;String affiliation;Departments add;
	public College(String name,String affiliation,Departments add)
	{
	this.name=name;
	this.affiliation=affiliation;
	this.add=add;
	}
	public void display()
	{
		System.out.println("Name of college:"+name);
		System.out.println("Affiliated to: "+affiliation);
		System.out.println("Departments are:");
		System.out.println("1. "+add.dep1);
		System.out.println("2. "+add.dep2);
		System.out.println("3. "+add.dep3);
	}

	public static void main(String[] args) {
		Departments obj1=new Departments("Commerse","Maths","CS");
		College obj2=new College("SSM","MGU",obj1);
		obj2.display();
	}

}
