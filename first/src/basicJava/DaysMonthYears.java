package basicJava;
import java.util.Scanner;
public class DaysMonthYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Total Days ");
		int Days = sc.nextInt();
		
		int Month = Days / 30 ;
		System.out.println("Total Month "+ Month);
		
		int Years = Days / 365 ;
		System.out.println("Total Year "+ Years);
		
	}

}
