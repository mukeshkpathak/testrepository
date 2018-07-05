package com.selenium.trial;

public class SubClass extends Base {

	public void subClassMethod() {

		//super.basemethod();

		System.out.println("Executing from Sub Class");
	}	

	public SubClass(int x, int y) {

		super.basemethod(x);
		int a =y;

		System.out.println("Executing from Sub Class");
		System.out.println("value of a is" +x);
		System.out.println("value of b is" +y);
	}
}
