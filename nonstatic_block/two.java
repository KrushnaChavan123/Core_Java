class two
{
 
 {
  System.out.println("inside the non-static block");
 }
 void m1()
 {
  System.out.println("inside the method");
 }
 public static void main(String[]args)
 {
   System.out.println("Start");
  //named object creation
  two t1=new two();
  t1.m1();

  //nameless object creation
new two().m1();
System.out.println("Stop");
}
}

