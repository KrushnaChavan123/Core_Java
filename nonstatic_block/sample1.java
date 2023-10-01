//instance block or non-static block

class sample1
{
 {
   System.out.println("Inside instance block");
 }
 public static void main(String[]args)
 {
  System.out.println("Start");
  sample1 s1=new sample1();
  System.out.println("Stop");
 }
}