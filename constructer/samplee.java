class sample1
{
  sample1()
  {
   this(10);
   System.out.println("Inside 0 arg const");
  }
  sample1(int a)
  {
   this(100,200.5f);
   System.out.println("Inside 1 arg const");
  }
  sample1(int a,float b)
  {
   System.out.println("Inside 2 arg const");
  }
  public static void main(String[]args)
  {
   System.out.println("Start");
   sample1 s1=new sample1();
   System.out.println("Stop");
  }
 }