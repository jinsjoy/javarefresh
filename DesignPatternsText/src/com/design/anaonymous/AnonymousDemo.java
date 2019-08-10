package com.design.anaonymous;

//Java program to demonstrate need for Anonymous Inner class 
interface Age 
{ 
  int x = 21; 
  void getAge(); 
} 
class AnonymousDemo 
{ 
  public static void main(String[] args)  
  { 
	  Age oj1 = new Age() {
          @Override
          public void getAge() {
              System.out.print("Age is "+x);
          }
      };

      // calling getage() method implemented at Myclass 
      oj1.getAge();      
  } 
} 

