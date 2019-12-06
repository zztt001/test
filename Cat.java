package day02;

public class Cat {
	private String color;
	private String breed;

	public Cat() {
		super();
	}

	public Cat(String color, String breed) {
		super();
		this.color = color;
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void eat() {
		System.out.println(this.color+"的"+this.breed+"在吃饭........");
	}

	public void catchMouse() {
		System.out.println(this.color+"的"+this.breed+"在抓老鼠........");
	}
}
