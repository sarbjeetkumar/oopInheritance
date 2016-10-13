package ie.gmit.sw;

import java.util.*;
public class Runner {

	public static void main(String[] args) {
		
		//T name = {...}
		//+ public , ~ /~ T methodName
		
		List<Paintable> list  = new ArrayList<>();
		
		
		//PaintingStudent p = new PaintingStudent(new OilPainter());
		
		
		for (int i = 0; i < args.length; i++) {
			double num = Math.random();
			
			if(num < 0.33d){
				list.add(new Cartonist());
				
			}else if(num < 0.66) {
				list.add(new OilPainter());
			}else{
				list.add(new DefaultFobbyist());
			}
		}
		
		process(list);
	}
							//Collection supertype Paramatric polymorphic
	public static void process(Collection< ? extends Drawable> col){
		for(Drawable d : col){
			d.draw();//Pollymorphic
			
			
			((Cartonist) d).draw(); // disaster run time error : java.lang.ClassException 
		}
	}

}
