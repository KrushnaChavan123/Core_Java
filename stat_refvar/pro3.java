//static vaariable and method--->non-static area
//single class--->direct,classname,direct

class pro3
{
 static char x='a';
  public static void main(String[]args)
  {
   pro3 refvar1=new pro3();
   //System.out.println(refvar1.x);
   refvar1.m2();
  }
 static void m1()
 {
  System.out.println("Inside m1 method");
 }
 void m2()
 { 
   System.out.println(x);m1();
   System.out.println(pro3.x);pro3.m1();
   pro3 refvar=new pro3();
   System.out.println(refvar.x);
  }

}
   
  