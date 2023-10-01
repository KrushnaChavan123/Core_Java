//check whether given number is prime pallindrome or not
//pallindrome number

class pallindrome111
{
 public static void main(String[]args)
 {
   int k;
   for(k=1;k<=1000;k++)
   {
  int num=k,rem,sum=0;
  //int copy=num;
  for(int i=1;i<=num;i++)
  {
	  if(num%i==0)
	  {
		  sum++;
	  }
  }
    if(sum==2)
	{
	 System.out.println(num);
	}
	
	
   rem=num%10;
   sum=(sum*10)+rem;
   num=num/10;
  }
   /*if(copy==sum)
  {
   System.out.println("pallindrome number");
  }
  else
  {
   System.out.println("Not pallindrome");
   }*/
 
}
}