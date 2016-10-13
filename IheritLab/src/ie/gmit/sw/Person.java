package ie.gmit.sw;

public class Person {

	private int energy = 100;

	public Person() {
		super();
	}

	public void study() {
		energy--;
		System.out.println(this.getClass().getName() + " ========Shoot");
	}

	public void sleep() {
		System.out.println(this.getClass().getName() + " ========sleep");
	}

	public void eat() {
		energy++;
		System.out.println(this.getClass().getName() + " ========eat");
	}

}