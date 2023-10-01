class cyber1
{
 int a= 120;
 static float b=120.5f;
 public static void main(String[]args)
 {
  cyber1 refvar2=cyber1.m1();
  System.out.println(refvar2.a+cyber1.b);
 }
 static cyber1 m1()
 {
  System.out.println("inside m21 method");
  cyber1 refvar1=new cyber1();
  System.out.println(refvar1.a+cyber1.b);
  return refvar1;
 }
}