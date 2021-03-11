/**
 * 
 */
package test;



import base.ShapeBase;
import shape.Rectangle;
import shape.Triangle;

/**
 * @author Kofi Acheampong
 *
 */
public class Test {

	
	private static void displayArea(ShapeBase base) {
		System.out.print(" Display the area for shape named" + base.getName() + "width=" + base.getWidth()  + "height=" + base.getHeight() + "the area is" + base.calculateArea());
		
	}
	
	public static void main(String[] args) {
		ShapeBase[] shapes = new ShapeBase[2];
		shapes[0]= new Rectangle("rect", 10.20);
		shapes[1] = new Triangle("tri", 10, 20);
		
		
		for (int i=0; i <shapes.length; ) {
			displayArea(shapes[i]);
			
		}
		

	}
}
