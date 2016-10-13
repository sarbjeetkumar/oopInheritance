package ie.gmit.sw;

public class DefaultFobbyist implements Hobbyable {

	
	public void shoot() {
		System.out.println(this.getClass().getName() + " ========Shoot");
		
	}

	
	public void draw() {
		
		System.out.println(this.getClass().getName() + "==========draw()");
	}

	
	public void mixColours() {
		
		System.out.println(this.getClass().getName() + "==========mix colour()");
		
	}


	public void doHobby() {
		
		System.out.println(this.getClass().getName() + "==========do hobby()");
		
	}

	

}
