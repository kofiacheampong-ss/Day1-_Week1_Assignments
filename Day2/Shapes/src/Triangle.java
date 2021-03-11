import java.math.*;


public class Triangle implements Shape {
	float a, b, c;
	Triangle(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	public float area() {
		float s = (a + b + c)/2;

		float area = (float)Math.pow((double)(s*(s-a)*(s-c)), 0.5);
		return area;



	}

	public float perimeter() {
		return  (a + b + c);

	}
}