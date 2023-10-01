//non static variable,method-->static area
//single class--->direct,class,object


class pro2
{
 int a=120;
 public static void main(String[]args)
 {
   //System.out.println(a);
   //System.out.println(pro2.a);
   pro2 refvar=new pro2();
   System.out.println(refvar.a);
   refvar.m1();
 }
 void m1()
 {
  System.out.println("Inside m1 method");
 }
}