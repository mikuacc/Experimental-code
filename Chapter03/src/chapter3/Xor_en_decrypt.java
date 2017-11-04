package chapter3;

public class Xor_en_decrypt {
	public static void main(String args[]) {
		char a[]= {'か','わ','い','い'};
		char key='A';
		int i;
		System.out.print("Encrypted data is:");
		for(i=0;i<a.length;i++) {
			a[i]=(char) (a[i]^key);
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.print("Original data is:");
		for(i=0;i<a.length;i++) {
			a[i]=(char) (a[i]^key);
			System.out.print(a[i]);
		}
	}
}
