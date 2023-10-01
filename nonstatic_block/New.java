class New
{
 boolean x=true;
 static void m1(New ss)
 {
  System.out.println("Inside the m1 method");
   System.out.println(ss.x);
 }
 public static void main(String[]args)
 {
  System.out.println("Start");
  //New n1=new New();
  New.m1(new New());
 }
}