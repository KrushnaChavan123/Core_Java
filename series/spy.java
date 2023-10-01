//spy number

class spy{
public static void main(String[]args)
{
 int num=22,rem,sum=0,product=1;
 for(;num>0;)
 
 {
  rem=num%10;
  sum=sum+rem;
  product=product*rem;
  num=num/10;
 }
if(sum==product)
{
 System.out.println("Spy");
}
else
{
 System.out.println("not spy number");
 }
 }
}