/**
 * 
 */
package shape;

import base.ShapeBase;

/**
 * @author Kofi Acheampong
 *
 */
public class Triangle extends ShapeBase {
	
	public Triangle(String name, int width, int height) {
		super(name, width, height);
		//TODO Auto-generated constructor stub
		
	}
	
	public int calculatArea() {
		return width * height / 2;
		
	
	}
}

