//static variable and static method--->static area
//multiple class-->class name approach,object


class pro2
{
 static float a= 120.0f;
 static void m1()
 {
   System.out.println("Inside m1 method");
 }
 
}
class pro1
{
  public static void main(String[]args)
  {
   System.out.println("Start @Cyber Success");
   //Direct access
   //System.out.println(a);m1();
   //class access
   System.out.println(pro2.a);pro2.m1();
   //object access
   pro2 refvar=new pro2();
   System.out.println(refvar.a);
   System.out.println("Stop @Cyber Success");
  }
 }
  