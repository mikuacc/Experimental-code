package chapter5.ext5;

public class A1 {
	int i;
	float f;
	char ch;
	A1(int x){
		i=x;
	}
	A1(int x,float y){
		i=x;
		f=y;
	}
	A1(int x,float y,char z){
		i=x;
		f=y;
		ch=z;
	}
}
class B1 extends A1 {
	boolean b;
	B1(int x,float y,char z,boolean a) {
		super(x,y,z);
		b=a;
	}
}
