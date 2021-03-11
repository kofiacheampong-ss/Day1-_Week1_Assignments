/**
 * 
 */
package base;

/**
 * @author Kofi Acheampong
 *
 */
public class ShapeBase implements ShapeInterface {
	protected String name;
	protected int width, height;
	
	public ShapeBase(String name, int width, int height) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
		
		
	@Override
	public int calculateArea() {
		//TOTO Auto-generated constructor stub 
		return 0;
	}
}
