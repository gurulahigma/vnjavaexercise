package com.visualnuts.hugo.test.exercise1;

public interface VisualNutsNumberPrinter {
	
	void print();
	
	default void printWithRestrictions(int number) {
		if(number%3==0 || number%5==0) {
			if(number%15==0) {
				System.out.println("'Visual Nuts'");
			}else if(number%5==0){
				System.out.println("'Nuts'");
			}else {
				System.out.println("'Visual'");
			}
		}else {
			System.out.println(number);
		}
	}
}
