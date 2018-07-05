package com.selenium.trial;

public class Driver{
	public static void main(String[] args) {

		// Base Class Only
			Base b = new Base();	
			b.basemethod(5);


		// Base Class Only
//		 Base b = new SubClass();
//		 b.basemethod();
		// b.subClassMethod();
		
		// Base cannot be cast to com.selenium.trial.SubClass
		//SubClass sc = (SubClass) new Base();
		//sc.basemethod();
		//sc.subClassMethod();

//		 Base & SubClass		
		 SubClass sc = new SubClass(6, 10);
//		 sc.basemethod();
//		 sc.subClassMethod();

	}

}
