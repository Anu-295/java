package polymorphismexample;
public class FootballChild1 extends SportsParent {
	public void play(float h,float w)
	{
		float r=h/w;
		System.out.println("Hight to weight ratio of child 1 is "+r);
	}

}
