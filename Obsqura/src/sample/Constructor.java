package sample;

public class Constructor {
	String name;
	int rno;
	public Constructor(String n,int r)
	{
		name=n;
		rno=r;
		
	}
	public void print()
	{
		System.out.println(name);
		System.out.println(rno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj=new Constructor("anu",1);
		obj.print();
		Constructor obj1=new Constructor("sree",7);
		obj1.print();

	}

}
