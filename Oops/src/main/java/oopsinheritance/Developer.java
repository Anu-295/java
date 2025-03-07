package oopsinheritance;

public class Developer extends Employ{
	int c=24;
		public void display()
		{
		System.out.println(c);
		}

			public static void main(String[] args) {
				Developer obj=new Developer();
				obj.display();
				obj.designation();
				obj.salary();
				System.out.println(obj.name);
				
			}
			}


