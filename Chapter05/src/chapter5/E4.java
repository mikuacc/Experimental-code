package chapter5;

class A4{
	int m;
	int getM() {
		return m;
	}
	int seeM() {
		return m;
	}
}
class B4 extends A4{
	int m;
	int getM() {
		return m+100;
	}
}
public class E4 {
	public static void main(String args[]) {
		B4 b=new B4();
		b.m=20;
		System.out.println(b.getM());
		A4 a=b;
		a.m=-100;
		System.out.println(a.getM());
		System.out.println(b.seeM());
	}
}
