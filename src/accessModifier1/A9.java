package accessModifier1;

public class A9 {

	public int i = 10;

	public  void m1() {
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
   
		 A9 a =new A9();
		 System.out.println(a.i);
		 a.m1();
		
	}
	
}
