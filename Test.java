package day02;

public class Test {

	public static void main(String[] args) {
		//�ٹ��췽��
		System.out.println("--------------���췽��----------------------");
		Cat cat = new Cat("��ɫ", "��˹è");
		Dog dog = new Dog("��ɫ", "����");
		cat.eat();
		cat.catchMouse();
		dog.eat();
		dog.lookHome();
		//��setter����
		System.out.println("------------setter����----------------------");
		Cat cat1 = new Cat();
		cat1.setColor("��ɫ");
		cat1.setBreed("��˹è");
		Dog dog1 = new Dog();
		dog1.setColor("��ɫ");
		dog1.setBreed("����");
		cat1.eat();
		cat1.catchMouse();
		dog1.eat();
		dog1.lookHome();
		
	}

}
