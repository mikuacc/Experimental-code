package chapter3;

public class Coding {
	public static void main(String args[]) {
 		int sum=0,x=1;
		for(int i=1;i<=10;i++) {
			x=x*i;
			sum=sum+x;
			}
		System.out.println(sum);
/*	public static void main(String args[]) {
		int i,n;
		for(i=2;i<=100;i++)
		{
			for(n=2;n<i;n++)
				if(i%n==0)
					break;
				if(n>=i)
					System.out.printf("% d",i);			
		}
		
	}*/
/*	public static void main(String args[]) {
		int i;
		double x1=1,sum1=0,x2=1,sum2=0;
		for(i=1;i<=20;i++) {
			x1=x1*(1.0/i);
			sum1+=x1;
		}
		System.out.println("用for循环的结果是:"+sum1);
		
		i=1;
		do {
			x2=x2*(1.0/i);
			sum2+=x2;
			i++;	
		}while(i<=20);

		System.out.println("用do-while循环的结果是:"+sum2);
	}*/
/*	public static void main(String args[]) {
		long x=8,sum=0;
		for(int i=0;i<10;i++) {
			sum=sum+x;
			x=x*10+8;
		}
		System.out.println(sum);
	}*/
/*	public static void main(String args[]) {
		int n=0,sum=0;
		for(n=1;;n++) {
			sum+=n;
			if(sum>8888) break;
		}	
		System.out.println(n-1);
		System.out.println(sum-n);
	}*/
/*	public static void main(String args[]) {
		int s;
		for(int i=1;i<=1000;i++){
			s=0;
			for(int j=1;j<i;j++)
		    	if(i%j==0)
		    		s=s+j;
		        if(s==i)
		        	System.out.print(i+" ");
		}*/
	}
}
