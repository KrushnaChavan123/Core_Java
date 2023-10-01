//Static member and static variable--->Static variable

class pro
{
 static int a=100;
 public static void main(String[]args)
 {
   System.out.println("Start @Cyber Success");
   //Direct access
   System.out.println(a);m1();
   //classname access
   System.out.println(pro.a);pro.m1();
   //object access
   pro refvar=new pro();
   System.out.println(refvar.a);refvar.m1();
   System.out.println("Stop @Cyber Success");
  }
  static void m1()
  {
  
   System.out.println("Inside m1 method ");
  }
}  
   