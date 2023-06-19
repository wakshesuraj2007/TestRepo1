package basicJava;
import java.util.Scanner;
public class CircleAreaDimeterCircumperance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("redius ");
		int redius = sc.nextInt();
		
		
		
//		System.out.println("PAi " );
//		float pai = sc.nextInt();
		
		
		double area = 3.14*(redius*redius) ;
		System.out.println("Area "+ area);
		
		double perimeter = 2* 3.14 * redius ;
		System.out.println("perimeter "+ perimeter);
		
		double Daimeter = 2*redius;
		System.out.println("Daimeter" + Daimeter);
		
	}

}
