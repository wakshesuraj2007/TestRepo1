package basicJava;
import java.util.Scanner;
public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("inter number");
		int num= sc.nextInt();                //1,2,3,4,5
		
		int counter = 0;
		while(num>0)
		{
			int rem=num%10;
			counter++;
			num=num/10;
			
		}
		System.out.println("counter is  "+counter);
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number");
//		int num=sc.nextInt();
//		//12345
//		int counter=0;
//		while(num>0)
//		{
//		//	int rem=num%10;
//			counter++;
//			num=num/10;
//		}
//		System.out.println("counter is.."+counter);
	}

}
