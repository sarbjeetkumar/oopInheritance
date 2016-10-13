package ie.gmit.sw;

public class PaintingStudent extends Student implements Paintable {

	private Paintable p;

	public PaintingStudent(Paintable p) {
		super();
		this.p = p;
		// TODO Auto-generated constructor stub
	}

	public void mixColours() {
		p.mixColours();
	}

	public void draw() {
		p.draw();
	}
	
	

}
