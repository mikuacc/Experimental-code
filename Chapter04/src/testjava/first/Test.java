package testjava.first;

import shape.area.Triangle;

public class Test {
	public static void main(String[] args) {
		Triangle tri1=new Triangle(5,12,13);
		System.out.println("�߳�Ϊ5,12,13�������ε����Ϊ:"+tri1.getArea());
		Triangle tri2=new Triangle(3,4,5);
		System.out.println("�߳�Ϊ3,4,5�������ε����Ϊ:"+tri2.getArea());
		tri1.setZ(15);
		System.out.println("�߳�Ϊ5,12,15�������ε����Ϊ:"+tri1.getArea());
		tri2.setZ(6);
		System.out.println("�߳�Ϊ3,4,6�������ε����Ϊ:"+tri2.getArea());
	}

}
