package com.bitwise.java;

public class LowerCaseBitwiseOR {
		
	public static void main(String args[]) {
		char ch;
		
		for(int i=0; i < 10; i++) {
			ch = (char) ('A' + i);
			System.out.print(ch);
			
	//		this statement turns on the the 6th bit
			ch = (char) ((int) ch | 32); // ch is now lowercase
			
			System.out.print(ch + " ");
		}
	}

}
