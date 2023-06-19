package basicJava;
import java.util.Scanner;
public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Principle amount ");
		int principle = sc.nextInt();
		
		System.out.println("Intrest Rate ");
		float Intrest = sc.nextInt();
		
		System.out.println("Time Duration in Year ");
		int Time = sc.nextInt();
		
		float SI = (principle*Intrest*Time)/100;
		System.out.println("Simple interest "+ SI);
		
	}

}
