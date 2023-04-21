package accessModifier1;

public class A {

	private int i = 10;

	private void m1() {
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
   
		 A a =new A();
		 System.out.println(a.i);
		 a.m1();
		
	}
	
}
