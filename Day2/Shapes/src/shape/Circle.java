/**
 * 
 */
package shape;

import base.ShapeBase;

/**
 * @author Kofi Acheampong
 *
 */
public class Circle extends ShapeBase {

	private double radius = 1.0;
	private final double PI = 3.14;
   
   public Circle() {
   		this.radius = radius;


   }

	// conststructor
	
	public Circle(double, radius) {
		this.radius = radius;
	}
		
	
	public double getRadius() {
			return radius;
		

	}

	
	public double calculatArea() {
		return PI * radius * radius;
		
	
	}
}