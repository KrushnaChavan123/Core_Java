class demo1
{
 {
  System.out.println("Inside non-static block");
 }
 demo1()
 {
  System.out.println("Inside the constructer");
 }
 public static void main(String[]args)
 {
 System.out.println("Start @Cyber Success");
 demo1 d1=new demo1();
 System.out.println("Stop @CYber Success");
 }
}