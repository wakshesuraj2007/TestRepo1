package basicJava;
import java.util.Scanner;
public class CelciousToFeran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Temprature in Celcious");
		double Cel = sc.nextInt();
		
		double Fahrenheit = Cel *1.8000+32.00;
		System.out.println("Celsious to Fahrenheit "+ Fahrenheit);
				
		double Celcious = (Fahrenheit-32)*5/9;
		System.out.println("Fahrenheit to celsious "+ Celcious);
		
		
	}

}
