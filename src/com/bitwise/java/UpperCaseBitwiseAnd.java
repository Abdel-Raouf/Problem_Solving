package com.bitwise.java;

public class UpperCaseBitwiseAnd {
	
	public static void main(String args[]) {
		char ch;
		
		for(int i = 0; i < 20; i++) {
			ch =  (char)('a' + i);
			System.out.print(ch);
			
//			using typecasting to change explicity from a bigger data type to a samller data type
//			while java make the changing from the smaller to bigger data type implicitly without any need of intervention from the programmers
//			this statement turns of the 6th bit
			ch = (char) (ch & 65503); // ch is now uppercase
			
			System.out.print(ch + " ");
		}
	}
}
