package com.acme.basic;

public class HelloWorld {
  @SuppressWarnings({"java:S1104"})
  public static final A instance = new A();
  
  void sayHello() {
    System.out.println("Hello World!");
  }

}
