package sample;

public class ThisMethod {
	int a=9;
	int b=7;
	public void add()
	{
		System.out.println(a+b);
		this.sub();
	}
	public void sub()
	{
		this.mul();
		System.out.println(a-b);
	}
	public void mul()
	{
		System.out.println(a*b);
		this.div();
	}
	public void div()
	{
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisMethod obj=new ThisMethod();
		obj.add();

	}

}
