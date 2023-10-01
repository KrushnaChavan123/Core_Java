class sample1
{
 sample1()
 {
  this(10);
  System.out.println("Inside 0 arg const");  ///java does not support recursive constructor
 }
 sample1(int a)
 {
  this();
  System.out.println("Inside 1 args const");
 }
 public static void main(String[]args)
 {
  sample1 s1=new sample1();
 }
}