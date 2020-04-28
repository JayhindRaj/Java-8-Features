/**
 * Example of Method Hiding
 * Method Hiding: Method Hiding supports early-binding or static-binding or compile-time binding.
 * 
 * @author jayrajpo
 * @since 21 APR, 2020
 */
public class MethodHiding {
	public static void main(String[] args) {
		A a = new B();
		a.print();
	}
}

class A {
	public static void print() {
		System.out.println("Printing from A");
	}
}


class B extends A {
	public static void print() {
		System.out.println("Printing from B");
	}
}