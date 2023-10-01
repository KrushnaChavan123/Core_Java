//sum of digit 123
class sum1
{
 public static void main(String[]args)
 {
  int num=123,rem,sum=0;
  
  for(;num>0;)
  {
   rem=num%10;
   sum=sum+rem;
   num=num/10;
  }
  System.out.println(sum);
 }
}