package basicJava;
import java.util.Scanner;
public class ReactangleAreaPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Lenght " );
		int Lenght = sc.nextInt();
		
		System.out.println("Width " );
		int Width = sc.nextInt();
		
		int Area = Lenght * Width ;
		System.out.println("Area "+ Area +" m2");
		
		int Perimeter = 2*Lenght + 2* Width;
		System.out.println("Perimeter "+ Perimeter);
		
	}

}
