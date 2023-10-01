class Neon
{
 public static void main(String[]args)
 {
  int num=9,rem,sum=0;
  int temp=num;
  num=(num*num);
  for(;num>0;)
  {
   rem=num%10;
   sum=rem+sum;
   num=num/10;
  }
  if(temp==sum)
  {
   System.out.println("NION");
  }
  else
  {
   System.out.println("Not NION");
  }
 }
}