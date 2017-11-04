package shape.area;

public class Triangle {
	int x,y;
	static int z;
	public Triangle(int xx,int yy,int zz) {
		x=xx;
		y=yy;
		z=zz;
	}
	public void setZ(int zz) {
		z=zz;
	}
	public double getArea() {
		double p=(x+y+z)/2.0;
		double s=java.lang.Math.sqrt(p*(p-x)*(p-y)*(p-z));
		return s;
	}
}
