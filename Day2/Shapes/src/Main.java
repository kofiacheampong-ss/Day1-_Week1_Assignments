import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter your Choice: ");
			System.out.println("1. Circle ");
			System.out.println("2. Rectangle ");
			System.out.println("3. Triangle ");
			
			int ch = sc.nextInt();
			
			
			switch(ch) {
			case 1:
				System.out.print("Enter the radius of the Circle : ");
				float r = sc.nextFloat();
				Circle ci = new Circle(r);
				System.out.println("Area : " + ci.area());
				System.out.println("Perimeter : " + ci.perimeter());
				break;
			case 2:
				System.out.print("Enter the length and width : ");
				float l = sc.nextFloat();
				float w = sc.nextFloat();
				Rectangle rec = new Rectangle(l,w);
				System.out.println("Area : " + rec.area());
				System.out.println("Perimeter : " + rec.perimeter());
				break;
			case 3:
				System.out.print("Enter the length of the sides of the Triangle : ");
				float x = sc.nextFloat();
				float y = sc.nextFloat();
				float z = sc.nextFloat();
				Triangle tri = new Triangle(x,y,z);
				System.out.println("Area : " + tri.area());
				System.out.println("Perimeter : " + tri.perimeter());
				break;


			}


		}

	}

}

