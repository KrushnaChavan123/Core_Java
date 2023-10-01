class whatsapp
{
 void m1()
 {
  System.out.println("inside m1 method");
 }
}
class snapchat extends whatsapp
{
 void m2()
 {
 System.out.println("inside m2 method");
 }
}
class facebook extends whatsapp
{
 void m3()
 {
   System.out.println("inside m3 method");
 }
}
class twitter extends whatsapp
{
 void m4()
 {
  System.out.println("Inside m4 method");
 }
}
class social
{
 public static void main (String[] args)
 {
  snapchat s1=new snapchat();
  s1.m1();
  s1.m2();
  System.out.println("**************************");

  facebook f1=new facebook();
  f1.m1();
  f1.m3();
  System.out.println("**************************");

  twitter t1=new twitter();
  t1.m1();
  t1.m4();
 }
}




