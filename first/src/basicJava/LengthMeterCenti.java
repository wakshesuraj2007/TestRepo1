package basicJava;
import java.util.Scanner;
public class LengthMeterCenti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Length in centimerter");
		int Length = sc.nextInt();
		
		int Meter = Length / 100 ;
		System.out.println("convert in Meter "+ Meter);
		
		int Kilometer = Length / 1000;
		System.out.println("convert in Km "+ Kilometer );
		
		
		
		
		
		
		
	}

}
