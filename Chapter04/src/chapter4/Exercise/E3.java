package chapter4.Exercise;

class B1{
	int n;
	static int sum=0;
	void setN(int n) {
		this.n=n;
	}
	int getSum() {
		for(int i=1;i<=n;i++)
			sum=sum+i;
		return sum;
	}
}
public class E3 {
	public static void main(String args[]) {
		B1 b1=new B1();
		B1 b2=new B1();
		b1.setN(3);
		b2.setN(5);
		int s1=b1.getSum();
		int s2=b2.getSum();
		System.out.println(s1+s2);
	}
}
