class samplee1
{
 boolean x=true;
 static void m1()
 {
  System.out.println("Inside m1 method");
  return new samplee1();
 }
 public static void main(String[]args)
 {
  samplee1 s1=new samplee1.m1();
  System.out.println("Control inside m1");
  System.out.println(s1.x);
 }
}
