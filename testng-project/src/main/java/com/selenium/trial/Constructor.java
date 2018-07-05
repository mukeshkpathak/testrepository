package com.selenium.trial;

public class Constructor {


	public Constructor() {

		System.out.println("Called From Constructor");
	}

	public void nonConstructor() {

		System.out.println("Called From nonConstructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Constructor con = new Constructor();
	con.nonConstructor();


	}

}
