public class Rectangle implements Shape {
	float l,w;
	Rectangle(float l, float w) {
		this.l = l;
		this.w = w;

	}

	public float area() {
		return l*w;

	}

	public float perimeter() {
		return 2*(l + w);

	}
}