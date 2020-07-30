package com.acme.basic;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
  private static List<Integer> l = new ArrayList<Integer>();
  
  void sayHello() {
    System.out.println("Hello World!");
    if (l.size() == 0) {
      System.out.println("a"); 
    }
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
  }
  
      
        
      
  // void notCovered() {
  //  System.out.println("This method is not covered by unit tests");
  //}

}
