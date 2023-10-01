//Assignment 29/08

class demo
{
 boolean status =true;
 static demo refvar;
 public static void main(String[]args)
 {  
 System.out.println("inside main");
  m1();
 }
 static void m1()
 { 
        System.out.println("Inside m1 method");
	  
	  refvar=new demo();
	  refvar.m2();
 }
 static void m2()
 {
	  System.out.println("Inside m2 method");
	 demo refvar2=new demo();
	 System.out.println(refvar2.status);
 }
}
  