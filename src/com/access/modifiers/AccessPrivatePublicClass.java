package com.access.modifiers;

public class AccessPrivatePublicClass {
	
	public static void main(String args[]) {
		PrivatePublicClass privatepublic = new PrivatePublicClass();
		
//		access to alpha is allowed only through its accessor methods
		privatepublic.setAplha(-99);
		System.out.print("privatepublic.setAplha is" + privatepublic.getAlpha());
		
//		 you cannot access alpha like this (Directly):
//		privatepublic.alpha = 10; //Wring! alpha is private!
		
//		these are ok because beta and gamma are public
		
		privatepublic.beta = 88;
		privatepublic.gamma = 99;
		
		
	}
}
