package day02;

public class Dog {
	private String color;
	private String breed;

	public Dog() {
		super();
	}

	public Dog(String color, String breed) {
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
		System.out.println(this.color+"的"+this.breed+"在啃骨头........");
	}

	public void lookHome() {
		System.out.println(this.color+"的"+this.breed+"在看家........");
	}
}
