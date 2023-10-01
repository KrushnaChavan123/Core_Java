//2 5 7 10 12....

class series1
{
 public static void main(String[]args)
 {
  int a=2,num;
  for(int i=1;i<=10;i++)
  {
   if(i%2!=0)
   {
	System.out.println(a +" ");
    a=a+3;
	//System.out.println(a);
    }
	else
	{
	  System.out.println(a +" ");
	 a=a+2;
	 //System.out.println(a);
	}
  }
}
}