package com.arul.june.repractice.java;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String givenStr ="dinesh";
		
		System.out.println(givenStr.length());
		
		char[] charray = givenStr.toCharArray();
		
		int length=0;
		
		for (char c : charray) {
			
			length++;
			
		}
		
			System.out.println(length);
		}

	}

