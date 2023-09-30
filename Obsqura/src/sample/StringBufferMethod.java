package sample;

public class StringBufferMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer obj=new StringBuffer("goodmorning");
		System.out.println(obj);
		obj.append("world");
		System.out.println(obj);
		obj.insert(0, "hey");
		System.out.println(obj);
		obj.replace(3, 7, "hghgj");
		System.out.println(obj);
		obj.delete(3, 7);
		System.out.println(obj);
		obj.reverse();
		System.out.println(obj);
	}

}
