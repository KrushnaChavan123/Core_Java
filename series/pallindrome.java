//pallindrome number

//reverse number
class pallindrome
{
 public static void main(String[]args)
 {
  int num=111,rem,sum=0;
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
 }
}