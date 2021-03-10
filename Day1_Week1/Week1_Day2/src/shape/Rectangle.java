/**
 * 
 */
package shape;

import base.ShapeBase;

/**
 * @author achea
 *
 */
public class Rectangle extends ShapeBase {
	
	public Rectangle(String name, int width, int height) {
		super(name, width, height);
		//TODO Auto-generated constructor stub
		
	}
	
	public int calculatArea() {
		return width * height;
		
	
	}
}