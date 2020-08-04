package com.acme.basic;

public class A() {
 	public A() {
		
	}
	public void foo() {
		System.out.println("foo");
	} 
}

public class HelloWorld {
	@SuppressWarnings({"java:S1104"})
	public static A instance = new A();
  
  void sayHello() {
    System.out.println("Hello World!");
  }

}
