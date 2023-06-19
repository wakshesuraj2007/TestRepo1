package basicJava;
import java.util.Scanner;
public class MarksAveragePerTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Marks of Marathi");
		int Marathi = sc.nextInt();
		
		System.out.println("Marks of English");
		int English = sc.nextInt();
		
		System.out.println("Marks of Hindi");
		int Hindi = sc.nextInt();
		
		System.out.println("Marks of MAths");
		int MAths = sc.nextInt();
		
		System.out.println("Marks of History");
		int History = sc.nextInt();
		
		int Total = Marathi+English+Hindi+MAths+History;
		System.out.println("Total of Student Marks "+ Total);
		
		int AEverge = Total / 5 ;
		System.out.println("Aeverge of Student Marks "+ AEverge);
		
		int percentage = (Total*100)/500;
		System.out.println("percentage of Student Marks " +percentage);
	}

}
