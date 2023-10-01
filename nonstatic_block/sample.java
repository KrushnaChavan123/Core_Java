//non-static blocks

class sample
{
 {
   System.out.println("Inside instance block-1");
  }
  {
   System.out.println("Inside instance block-2");
  }
  public static void main(String[]args)
  {
   System.out.println("Start @Cyber Success");
   sample s1=new sample();
   System.out.println("Stop @Cyber Success");
  }
 }
