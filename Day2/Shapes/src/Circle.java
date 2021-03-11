public class Circle implements Shape {
	float r;
	Circle(float r) {
		this.r = r;

	}

	public float area() {
		return (3.14f*r*r);

	}

	public float perimeter() {
		return (2*3.14f*r);

	}
}