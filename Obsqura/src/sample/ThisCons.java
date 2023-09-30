package sample;

public class ThisCons {
	public ThisCons()
	{
		this("anu");
		System.out.println("Default constructor");
	}
	public ThisCons(int a)
	{
		System.out.println(a);
	}
	public ThisCons(String b)
	{
		this(5);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisCons obj=new ThisCons();

	}

}
