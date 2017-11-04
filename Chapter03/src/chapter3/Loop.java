package chapter3;
import java.util.Scanner;
public class Loop {
	public static void main(String args[]) {
		while(true) {
		Scanner reader=new Scanner(System.in);
		int i,j,k,x;
		System.out.print("请输入要输出的行数:");
		x=reader.nextInt();
		for(i=1;i<=x;i++) {
			for(j=0;j<i-1;j++)
				System.out.print(' ');
			for(k=2*x-1;k>=2*i-1;k--)
				System.out.print("*");
		System.out.println();
		}
		}
	}
}
/*for(int i=0;i<5;i++) {
for(int n=0;n<i;n++)
	System.out.print(' ');
for(int x=9;x>=2*i+1;x--)
	System.out.print('*');
System.out.println();*/
