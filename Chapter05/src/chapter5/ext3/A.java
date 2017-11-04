package chapter5.ext3;

public class A {
	float radius,Pi=3.14f;
	float area(float r) {
		return Pi*r*r;
	}
}
class B extends A {
	float area(float r) {
		return 4*Pi*r*r;
	}
	void myPrint(float r) {
		System.out.println("半径为"+r+"圆的面积"+super.area(r));
		System.out.println("半径为"+r+"球的表面积是:"+area(r));
	}
}