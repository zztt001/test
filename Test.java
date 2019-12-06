package day02;

public class Test {

	public static void main(String[] args) {
		//①构造方法
		System.out.println("--------------构造方法----------------------");
		Cat cat = new Cat("花色", "波斯猫");
		Dog dog = new Dog("黑色", "藏獒");
		cat.eat();
		cat.catchMouse();
		dog.eat();
		dog.lookHome();
		//②setter方法
		System.out.println("------------setter方法----------------------");
		Cat cat1 = new Cat();
		cat1.setColor("花色");
		cat1.setBreed("波斯猫");
		Dog dog1 = new Dog();
		dog1.setColor("黑色");
		dog1.setBreed("藏獒");
		cat1.eat();
		cat1.catchMouse();
		dog1.eat();
		dog1.lookHome();
		
	}

}
