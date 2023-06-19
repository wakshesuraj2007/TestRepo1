package basicJava;
import java.util.Scanner;
public class TRangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Base of Trangle");
		int Base = sc.nextInt();
		
		System.out.println("Height of Trangle");
		int Height = sc.nextInt();
		
		System.out.println("side of Trangle ");
		int Side =sc.nextInt();
		
		int Area =(Base * Height)/2;
		System.out.println("Area of Trangle "+ Area);
		
		double Equilateral = (1.73*Side*Side)/4;
		System.out.println("Area of Equivalant TRangle "+ Equilateral );
	}

}
