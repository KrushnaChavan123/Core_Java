class demo3
{
 static int a=100;
 
  public static void main(String[]args)
  {
   System.out.println("Start @Cyber success");
       //object
	   demo3 obj2=new demo3();
	   obj2.m2();
   
      System.out.println("Stop @Cyber success");
	  }
     static void m1()
   {
    System.out.println("Inside m1 method");
   }

 void m2()
 {
  //direct
  System.out.println(a);
  m1();
  //class access
  System.out.println(demo3.a);
  demo3.m1();
  demo3 obj1=new demo3();
  System.out.println(obj1.a);
  obj1.m1();
  
  
  }
 }
   
   
