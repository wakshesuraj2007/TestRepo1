package basicJava;

public class PrimeNumberLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num = 29;
//		boolean flag = false;
//		for(int i=2; i<=num/2; i++)
//		{
//			//condition for nonprime number
//			if (num % i ==0)
//			{
//				flag = true ;
//				break;
//			}
//			
//		}
//		
//		if(!flag)
//			System.out.println(num + " is a prime number");
//		else
//			System.out.println(num + " is a not prime number");
		
//		**************************************************************************
		
		int num = 33, j= 2;
		boolean flag = false;
		while (j <=num/2)
		{
			//condition for nonprime number
			if(num%1 == 0)
			{
				flag = true;
				break;
			}
			j++;
		}
		if(!flag)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is a not prime number");
		
		}

}
