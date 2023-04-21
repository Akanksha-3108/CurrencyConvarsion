package accessModifier1;

public class A2 {

	 int i = 10;

	 void m1() {
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
   
		 A2 a =new A2();
		 System.out.println(a.i);
		 a.m1();
		
	}
	
}
