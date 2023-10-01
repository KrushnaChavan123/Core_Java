class cap3
{
 void m1()
 {
  System.out.println("Inside m1 method");
 }
}
 class cap4
 {
  int a= 123;
 }
 class cap5
 {
  public static void main(String[]args)
  {
   cap3 obj1 = new cap3();
   obj1.m1();
   cap4 obj2 = new cap4();
   System.out.println(obj2.a);
  }
 }