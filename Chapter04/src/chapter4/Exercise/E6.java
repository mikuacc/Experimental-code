package chapter4.Exercise;

class AAA{
	static {
		System.out.println("����AAA�еľ�̬��!");
	}
}
public class E6 {
	static {
		System.out.println("�������ȱ�ִ�еľ�̬��!");
	}
	public static void main(String args[]) {
		AAA a=new AAA();
		System.out.println("�����˽⾲̬(static)��");
	}
}
