package basicJava;
import java.util.Scanner;
public class AllArathamitcOpration {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second number");
		int num2 = sc.nextInt();
		
		int addition = num1+num2;
		System.out.println("Addition "+ addition);
		
		int subtraction = num1-num2;
		System.out.println("Subtration "+ subtraction);
		
		int Multi = num1 * num2 ;
		System.out.println("multiplication "+ Multi);
		
		int Divide = num1 / num2 ;
		System.out.println("Dividee "+ Divide);
		
		
		
	}

}
