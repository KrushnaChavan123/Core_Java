class A
{
	int a = 100;
}
final class B extends A
{
	void m1(){
		System.out.println("Inside m1 method "+ a);
	}
}
class C 
{
	public static void main(String[] args){
		System.out.println("Start");
		B b1 = new B();
		b1.m1();
		System.out.println("Stop");
	}
}

class A1
{
	int a = 100;
}
final class B1 extends A1
{
	void m1(){
		System.out.println("Inside m1 method "+ a);
	}
	public static void main(String[] args){
		System.out.println("Start");
		B1 b1 = new B1();
		b1.m1();
		System.out.println("Stop");
	}
}
