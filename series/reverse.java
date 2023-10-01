//reverse number
class reverse
{
 public static void main(String[]args)
 {
  int num=123,rem,sum=0;
  for(;num>0;)
  {
   rem=num%10;
   sum=(sum*10)+rem;
   num=num/10;
  }
  System.out.println(sum);
 }
}