// Java program to Swap
// Two variable

 class Swap2 {
	
	public static void main(String[] args)
	{
		int x = 100, y = 200;

		System.out.println("Before Swap");
		System.out.println(" The value of x is = " + x);
		System.out.println(" The value of y is = " + y);

		
		int temp = x;
		x = y;
		y = temp;

		System.out.println("After swap");
		System.out.println("The value of x is = " + x);
		System.out.println("The value of y is = " + y);
	}
}
