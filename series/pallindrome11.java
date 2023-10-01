//pallindrome number

class pallindrome11
{
 public static void main(String[]args)
 {
  int num=131,rem,sum=0,sum1=0;
  int copy=num;
  for(;num>0;)
  {
   rem=num%10;
   sum=(sum*10)+rem;
   num=num/10;
  }
  if(copy==sum)
  {
   System.out.println("pallindrome number");
  }
  else
  {
   System.out.println("Not pallindrome");
   }
   
   
   for(int i=1;i<=sum;i++)
  {
	  if(sum%i==0)
	  {
		  sum1++;
	  }
  }
    if(sum1==2)
	{
	 System.out.println("its is prime pallindrome");
	}
	else
	{
		 System.out.println("IT is not a prime pallindrome");
    }
   
 }
}