package com.acme.basic;

public class HelloWorld {
  String testStr = "test";
  
  void sayHello() {
    System.out.println("Hello World!");
    System.out.println(testStr.equals("test"));
    
    testStr = null;
    System.out.println(testStr.equals("test"));
    
    System.out.println("test".equals(testStr));
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
  }

}
