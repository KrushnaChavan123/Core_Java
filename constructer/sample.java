class sample
{
 sample(int a)
 {
  System.out.println("Inside the 1 argument");
  return;
 }
 public static void main(String[]args)
 {
  System.out.println("Start");
  sample s1=new sample(12);
  System.out.println("Stop");
 }
}