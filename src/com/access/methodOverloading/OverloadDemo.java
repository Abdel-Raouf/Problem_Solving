package com.access.methodOverloading;

//hint: method overloading supports polymorphism because it is one way that java implements the "one interface, multiple methods" paradigm.
// Java's standared class library includes an absolute value method, called abs(). this method is overloaded by the java's Math class
// to handle all of the numeric types.
// hint: we should overload only closely related operations.
public class OverloadDemo {

	
	public static void main(String args[]) {
		Overload ob = new Overload();
		int resI;
		double resD;
		
//		 call all versions of ovlDemo()
		ob.ovelDemo();
		System.out.println();
		
		ob.ovelDemo(2);
		System.out.println();

				
		resI = ob.ovelDemo(4, 6);
		System.out.println("Reesult of ob.ovlDemo(4,6): " + resI);

		resD = ob.ovelDemo(1.1,  2.32);
		System.out.println("Reesult of ob.ovlDemo(1.1,2.32): " + resD);
	}
}
