package chapter4.Exercise;

class Fish{
	int weight=1;
}
class Lake{
	Fish fish;
	void setFish(Fish s) {
		fish=s;
	}
	void feedFish(int m) {
		fish.weight=fish.weight+m;
	}
}
public class E1 {
	public static void main(String args[]) {
		Fish redFish=new Fish();
		System.out.println(redFish.weight);
		Lake lake=new Lake();
		lake.setFish(redFish);
		lake.feedFish(120);
		System.out.println(redFish.weight);
		System.out.println(lake.fish.weight);
	}
}
