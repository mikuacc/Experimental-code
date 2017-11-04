package simulator;

public abstract class Animal {
	abstract void cry();
	abstract String getAnimalName();
}
class Cat extends Animal{
	void cry() {
		System.out.println("����");
	}
	String getAnimalName() {
		return "Cat";
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("����");
	}
	String getAnimalName() {
		return "Dog";
	}
}

