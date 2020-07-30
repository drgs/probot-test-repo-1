package com.acme.basic;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
  private List<Integer> l = new ArrayList<Integer>();
  
  public String sayHello() {
    System.out.println("Hello World!");
    
    if (l.isEmpty() && (1 + 1) == 2) {
      return "...";
    }
    if (l.isEmpty()) {
      return "...";
    }
    if (!l.isEmpty()) {
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
    return "a";
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
