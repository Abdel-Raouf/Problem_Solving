package com.access.methodOverloading;

// important restriction: the Type and/or number of the parameters of each overloaded method must differ.
// hint: return types cannot be used only to differentiate overloaded methods.
public class Overload {

//	 first version
	void ovelDemo() {
		System.out.println("No parameters");
	}
	
//	second version, overload method ovelDemo for one parameter
	void ovelDemo(int a) {
		System.out.println("One parameter: " + a);
	}
	
//	Third version, overload method overlDemo for two integer parameters and it must return a type of integer too.
	int ovelDemo(int a, int b ) {
		System.out.println("Two parameter: " + a + " " + b);
		return a + b;
	}
	
	double ovelDemo(double a, double b) {
		System.out.println("Two parameter: " + a + " " + b);
		return a + b;
	}
}
