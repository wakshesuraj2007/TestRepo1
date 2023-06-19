package basicJava;

public class Teranary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a=100;
//		int b=20;
//		int num1=10;
//		int num2=45;
//		int num3=67;
//		
//		
//		int c=(a>b)?a:b;
//		System.out.println(c);
//		         //exp1    //exp2    //exp
//		String s=(a>b)?"a is greater":"b is greater";
//		System.out.println(s);
//		
//	String s1=(num1>num2 && num1>num3)?"num1 is greater":(num2>num1 && num2>num3)?"num2 is greater":"num3 is gretaer";
//		System.out.println(s1);
		
		int a = 200;
		int b = 60;
		int num1 = 20;
		int num2 = 55;
		int num3 = 77;
		
		int c=(a>b)?a:b;                 //exp1
		System.out.println(c);
		
		String s=(a>b)?"a is Greater":"b is Greater" ;     //exp2
			System.out.println(s);
		
		String s1 = (num1>num2 && num1>num3)?"num1 is greater":(num2>num1 && num2>num3)?"num2 is greater":"num3 is greater";
		System.out.println(s1);
		
		
	}

}
