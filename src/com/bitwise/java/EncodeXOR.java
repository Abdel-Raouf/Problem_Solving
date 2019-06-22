package com.bitwise.java;

public class EncodeXOR {
//	XOR will set a bit on if, and only if, the bits being compared are different.
	public static void main(String args[]) {
		String msg = "I love you";
		String encmsg = "";
		String decmsg = "";
		int key = 88;
		
		System.out.print("Original message: ");
		System.out.print(msg);
		
//		encode the message
		for(int i=0; i < msg.length(); i++) {
			encmsg = encmsg + (char) (msg.charAt(i) ^ key);
		}
		
		System.out.print(" Encoded message: ");
		System.out.print(encmsg);
		
//		 decode the message
		for(int i=0; i < msg.length(); i++) {
			decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
		}
		
		System.out.print(" Decoded message: ");
		System.out.print(decmsg);
	}
}
