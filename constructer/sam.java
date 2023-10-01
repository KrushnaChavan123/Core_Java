class sample2
{
 sample2()
 {
  this(10);
  System.out.println("inside 0 arg const - sample2");
 }
 sample2(int a)
 {
  System.out.println("Inside 1 arg const - sample2");
 }
}
class sample1
{
 public static void main(String[]args)
 {
  System.out.println("Start");
  sample2 s1=new sample2();
  System.out.println("stop");
 }
}