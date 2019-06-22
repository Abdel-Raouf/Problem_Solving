package com.access.modifiers;

public class PrivatePublicClass {
	
	private int alpha; //private access
	public int beta; //public access
	int gamma; //default access
	
//	Methods to access alpha. it is ok for a member of a class to access a private member of the same class
	void setAplha(int a) {
		alpha = a;
	}
	
	int getAlpha() {
		return alpha;
	}
}
