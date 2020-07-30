package com.acme.basic;

public class HelloWorld {

  void sayHello() {
    System.out.println("Hello World!");
    
    if (l.size() == 0 && (1 + 1) == 2) {
      return "...";
    }
    if (l.size() == 0) {
      return "...";
    }
    if (l.size() != 0) {
      return "...";
    }
    if (l.size() > 0) {
      return "...";
    }
    if (l.size() < 1) {
      return "...";
    }
    if (l.size() >= 1) {
      return "...";
    }
    if(l.size() > 1) {
      return "..."; 
    }
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
  }
  
  // void sayHello() {
  //  System.out.println("Hello World!");
  // }

  // void notCovered() {
  //  System.out.println("This method is not covered by unit tests");
  // }
  
  // void sayHello() {
  //  System.out.println("Hello World!");
  // }

  // void notCovered() {
  //  System.out.println("This method is not covered by unit tests");
  //}

}
