package com.access.CallByReference;


// objects are pass through their references
public class TestCallByReference {


	int a, b;
	
	TestCallByReference(int i, int j) {
		a = i;
		b = j;
	}
	
	
//	pass an object. Now, ob.a and ob.b in object used in the call will be changed
	void change(TestCallByReference ob) {
		ob.a = ob.a + ob.b;
		ob.b = -ob.b;
	}
}
