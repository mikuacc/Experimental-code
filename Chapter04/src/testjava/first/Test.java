package testjava.first;

import shape.area.Triangle;

public class Test {
	public static void main(String[] args) {
		Triangle tri1=new Triangle(5,12,13);
		System.out.println("边长为5,12,13的三角形的面积为:"+tri1.getArea());
		Triangle tri2=new Triangle(3,4,5);
		System.out.println("边长为3,4,5的三角形的面积为:"+tri2.getArea());
		tri1.setZ(15);
		System.out.println("边长为5,12,15的三角形的面积为:"+tri1.getArea());
		tri2.setZ(6);
		System.out.println("边长为3,4,6的三角形的面积为:"+tri2.getArea());
	}

}
