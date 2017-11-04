package chapter4;

class CPU{
	int speed;
	void setSpeed(int s) {
		speed=s;
	}
	int getSpeed() {
		return speed;
	}
}
class HardDisk{
	int amount;
void setAmount(int a) {
		amount=a;
	}
	int getAmount() {
		return amount;
	}
}
class PC{
	CPU cpu;
	HardDisk HD;
	void setCPU(CPU c) {
		cpu=c;
	}
	void setHardDisk(HardDisk h) {
		HD=h;
	}
	void show() {
		System.out.println("CPU's speed is "+cpu.speed+"MHz.");
		System.out.println("HardDisk's amount is "+HD.amount+"GB.");
	}
}
public class Test {
	public static void main(String args[]) {
		CPU cpu=new CPU();
		cpu.setSpeed(2200);
		HardDisk disk=new HardDisk();
		disk.setAmount(200);
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}
}
