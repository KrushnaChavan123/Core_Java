//1 77 111 7777 11111....

class series2
{
 public static void  main(String[]args)
 {
  int a=1,b=77;
   for(int i=1;i<=6;i++)
   {
    if(i%2==0)
	{
	 System.out.print(b+" ");
	 b=(b*100)+77;
	}
	else
	{ 
	  System.out.print(a+" ");
	 a=(a*100)+11;
	}
   }
  }
 }
	 