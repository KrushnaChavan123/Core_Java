class sample
{
 static
 {
   System.out.println("Inside static block: -1");
  }
  static
	{
	  System.out.println("Inside sttaic block: -2");
	}
       public static void main(String[]args)
  {
   System.out.println("Start");
   System.out.println("Stop");
  }
 }