package sample;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="anusree";
		System.out.println(s.length()); //variablename.methodname();
		String s1="hello";
		System.out.println(s1.charAt(3));
		
		
		int a=15;
		String c=String.valueOf(a);
		System.out.println(c);
		String x="sree";
		String y="sree";
		String z="SREE";
		System.out.println(x.equals(y));
		System.out.println(y.equals(z));
		System.out.println(y.equalsIgnoreCase(z));
		String p="";
		String q="hey";
		System.out.println(p.isEmpty());
		System.out.println(q.isEmpty());

	}

}
