package com.actitime.pom;

public class B {
public static void main(String[] args) {
	
	A a1=new A(10);
	int X =a1.getvalue();
	System.out.println(X);
	a1.setvalue(30);
	System.out.println(a1.getvalue());
}
}
