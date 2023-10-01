class Inher3{
	static int a = 400;
	static void m1(){
		System.out.println("Inside m1 method "+a);
	}
}
class Inher2 extends Inher3{
	static float b = 300.30f;
	static void m2(){
		System.out.println("Inside m2 method "+b);
	}
}
class Inher1 extends Inher2{
	static boolean c = true;
	static void m3(){
		System.out.println("Inside m3 method "+c);
	}
}
class Inheri extends Inher1{
	public static void main(String[] args){
		System.out.println("Start");
		m1();
		m2();
		m3();
		System.out.println("Stop");
	}
}