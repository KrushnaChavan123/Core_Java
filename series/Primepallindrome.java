//pallindrome number

class Primepallindrome
{
 public static void main(String[]args)
 {
	 int k;
	 for(k=1;k<=1000;k++)
	 {
  int num=k,rem,sum=0,sum1=0;
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
	 System.out.println(num);
	}
 }
   
 }
}