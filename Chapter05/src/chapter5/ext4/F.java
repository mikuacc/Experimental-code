package chapter5.ext4;

public class F {
	static E b(E e) {
		E c=new E((short)0,(char)0);
		c.i=(short)(e.i+3);
		c.ch=(char)(e.ch+3);
		return c;
	}
	public static void main(String args[]) {
		E x1,x2;
		x1=new E((short)12,'6');
		x2=new E((short)62,(char)65);
		System.out.println("x1中的i="+x1.i+",ch="+x1.ch);
		System.out.println("x2中的i="+x2.i+",ch="+x2.ch);
		System.out.println("调用b(x1)后的i="+b(x1).i+",ch="+b(x1).ch);
		System.out.println("调用b(x2)后的i="+b(x2).i+",ch="+b(x2).ch);
		System.out.println("x1中的i="+x1.i+",ch="+x1.ch);
		System.out.println("x2中的i="+x2.i+",ch="+x2.ch);
	}
}
