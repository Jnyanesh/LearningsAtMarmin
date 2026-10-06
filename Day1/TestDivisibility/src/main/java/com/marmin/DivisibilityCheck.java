package com.marmin;

public class DivisibilityCheck{
	static boolean isDivisible(int number){
		System.out.println("Int invoked");
		if(number%2 ==0 && number%3 == 0){
			return true;
		}
		else{
			return false;
		}
	}

	static boolean isDivisible(double number){
		System.out.println("Double invoked");
		if(number%2 == 0 &&  number%3==0){
			return true;
		}
		else{
			return false;
		}
		
	}
}
