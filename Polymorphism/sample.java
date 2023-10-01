class sample
{
 public static void main(String[]args)
 {
  System.out.println("Inside 1 arg");
  sample s1=new sample();
  s1.main();
  s1.main(100,200.5f);
 }
 public static void main()
 {
  System.out.println("Inside main 0 arg");
 }
 public static void  main(int a ,float b)
 {
  System.out.println("Inside main -2 arg");
 }
}