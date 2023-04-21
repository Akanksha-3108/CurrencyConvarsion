package accessModifier1;

public class A5 {

	protected int i = 10;

	protected  void m1() {
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
   
		 A5 a =new A5();
		 System.out.println(a.i);
		 a.m1();
		
	}
	
}
