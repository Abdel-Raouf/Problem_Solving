package com.access.CallByReference;

public class PassObjectReference {

	
	public static void main(String args[]) {
		TestCallByReference ob = new TestCallByReference(15, 20);
		
		System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
		
//		as we see, operations made inside change() have affected the object used as an argument
		ob.change(ob);
		
		System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
		
	}
}
