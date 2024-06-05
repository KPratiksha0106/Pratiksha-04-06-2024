package com.JavaStringMethods;

public class Example1 {
	
	public static void main(String[] args) {
		String text= "Welcome to Java Programming";
		System.out.println(text.length());
		System.out.println("----------------------");
		for (int i=0; i<text.length();i++)
		{
			System.out.println(text.charAt(i));
		}
	}

}
