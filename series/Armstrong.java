//Armstrong number

class Armstrong
{
 public static void main(String[]args)
 {
  int num=153,rem,sum=0;
  int temp=num;
  for(;num>0;)
  {
   rem=num%10;
   sum=(rem*rem*rem)+sum;
   num=num/10;
  }
  if(temp==sum)
  {
   System.out.println("Armstrong number");
  }
  else
  {
   System.out.println("Not armstrong number");
  }
 }
}