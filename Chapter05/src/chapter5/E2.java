package chapter5;

class A2{
	public int getNumber(int a) {
		return a+1;
	}
}
class B2 extends A2{
	public int getNumber(int a) {
		return a+100;
	}
}
public class E2 {
	public static void main(String args[]) {
		A2 a=new A2();
		System.out.println(a.getNumber(10));
		a=new B2();
		System.out.println(a.getNumber(10));
	}
}
