class Inher3{
	static int a = 400;
}
class Inher2 extends Inher3{
	static float b = 300.30f;
}
class Inher1 extends Inher2{
	static char c = 'x';
}
class Inher extends Inher1{
	public static void main(String[] args){
		System.out.println("Start");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("Stop");
	}
}