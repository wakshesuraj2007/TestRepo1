package basicJava;
import java.util.Scanner;
public class AdditionOfNumbersUsingIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc=new Scanner(System.in);
		int sum=0;
		while(true)
		{
			System.out.println("Enetr value");
			int num=sc.nextInt();
			
			if(num==0)
			{
				break;
			}
			sum=sum+num;
			
		}
		
		System.out.println("sum is"+sum);

	}

}
