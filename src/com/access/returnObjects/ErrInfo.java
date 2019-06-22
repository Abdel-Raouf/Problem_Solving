package com.access.returnObjects;

public class ErrInfo {

	public static void main(String args[]) {
//		here i create a new object from the ErrorInfo class 
		ErrorInfo err = new ErrorInfo();
//		here i create a variable of type Err AS when i assign to it anything of the Type Err it will accept it.
//		hint: it must be inside a main function to accept a variable of an object type as (Err)
		Err e;
		
//		we make the variable e of an object type Err as we will assign to it a method that returns the same type 
//		hint: the type of the variable must match the type of the method that we assign to it. 
		e = err.getErrorInfo(2);
		System.out.println(e.msg + " severity: " + e.severity);

		e = err.getErrorInfo(19);
		System.out.println(e.msg + " severity: " + e.severity);
	}
}
