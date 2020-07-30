package com.acme.basic;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
  private static List<Integer> l = new ArrayList<Integer>();
  
  void sayHello() {
    System.out.println("Hello World!");

    if (l.isEmpty()) {
      System.out.println("a"); 
    }
    
    if (!l.isEmpty()) {
      System.out.println("b"); 
    }
    
    if (!l.isEmpty()) {
      System.out.println("c"); 
    }
    
    if (l.size() < 1) {
      System.out.println("d"); 
    }
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
  }
  
      
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
