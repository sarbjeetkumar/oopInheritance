package ie.gmit.sw;

public class Cartonist extends AbstractArtist {

	
	public void mixColours() {
		System.out.println(this.getClass().getName() + " ========Mixcolours");
		
	}


	public void draw() {
		System.out.println(this.getClass().getName() + " ========Draw");
		
	}

	
	public void paint() {
		
		System.out.println(this.getClass().getName() + " ========Paint");
	}

	

}
