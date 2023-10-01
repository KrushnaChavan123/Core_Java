class prime
{
 public static void main(String[]args)
 {
	 int k;
	 for(k=1;k<=1000;k++)
	 {
  int num=k,sum=0;
	  
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
	 }
  
 }
}