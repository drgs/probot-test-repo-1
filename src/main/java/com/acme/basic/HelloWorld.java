package com.acme.basic;

public class HelloWorld {
  String testStr = "test";

  public boolean foo(String bar) {
     return bar.equals("foo");
  }
 
  void sayHello() {
    System.out.println("Hello World!");
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
  }

}
