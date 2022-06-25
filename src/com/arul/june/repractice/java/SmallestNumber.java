package com.arul.june.repractice.java;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SmallestNumber {
	
		Integer givenArray[] = {3,15,78,1};
	
	public void smallest() {
		
		
		
		Arrays.sort(givenArray);
		System.out.println(givenArray[0]);
	}
	
	public void collections() {
		
		List<Integer> obj2 = Arrays.asList(givenArray);
		
		Collections.sort(obj2);
		
		int small = obj2.get(0);
		
		System.out.println(small);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SmallestNumber obj = new SmallestNumber();
		obj.collections();
		
		
	}

}
