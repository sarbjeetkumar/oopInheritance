package ie.gmit.sw;

public abstract class AbstractArtist implements Paintable {

	public void study(){
		paint();
	}
	
	public abstract void paint();		//deferred method

}
