package polymorphismexample;

public class HockeyChild3 extends SportsParent {
	public void play(float h,float w)
	{
		float r=h/w;
		System.out.println("Hight to weight ratio of child 3 is "+r);
		super.play(160,40);
	}


	public static void main(String[] args) {
		HockeyChild3 obj=new HockeyChild3();
		CricketChild2 obj2=new CricketChild2();
		FootballChild1 obj3=new FootballChild1();
		obj.play(180, 58);
		obj2.play(200, 58);
		obj3.play(170, 58);
		

	}

}
