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
		System.out.println("x1�е�i="+x1.i+",ch="+x1.ch);
		System.out.println("x2�е�i="+x2.i+",ch="+x2.ch);
		System.out.println("����b(x1)���i="+b(x1).i+",ch="+b(x1).ch);
		System.out.println("����b(x2)���i="+b(x2).i+",ch="+b(x2).ch);
		System.out.println("x1�е�i="+x1.i+",ch="+x1.ch);
		System.out.println("x2�е�i="+x2.i+",ch="+x2.ch);
	}
}
