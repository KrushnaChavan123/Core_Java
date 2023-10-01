class sample3
{
 sample3()
 {
  System.out.println("Inside 0 arg constructor");
 }
 sample3(boolean status)
 {
  System.out.println("Inside 1 args constructor");
 }
 sample3(int a, char z)
 {
  System.out.println("Inside 2 arg constructor");
 }
 public static void main(String[]args)
 {
   System.out.println("Start");
  sample3 s1=new sample3();
  sample3 s2=new sample3(true);
  sample3 s3=new sample3(12,'a');
  System.out.println("Stop");
 }
}
