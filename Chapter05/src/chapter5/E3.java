package chapter5;

class A3{
	double f(double x,double y) {
		return x+y;
	}
	static int g(int n) {
		return n*n;
	}
}
class B3 extends A3{
	double f(double x,double y) {
		double m=super.f(x, y);
		return m+x*y;
	}
	static int g(int n) {
		int m=A3.g(n);
		return m+n;
	}
}
public class E3 {
	public static void main(String args[]) {
		B3 b=new B3();
		System.out.println(b.f(10.0, 8.0));
		System.out.println(b.g(3));
		A3 a=new B3();
		System.out.println(a.f(10.0,8.0));
		System.out.println(a.g(3));
	}
}
