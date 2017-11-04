package chapter4;

public class Struct_Method {
	int x,y;
	/*Object(int a,int b){
		x=a;
		y=b;
	}*/
}
class Main{ 
	public static void main(String args[]) {
		Struct_Method obj1=new Struct_Method();
		obj1.x=obj1.y=11;
		System.out.println(obj1.x+obj1.y);
	}
}