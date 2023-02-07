import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		if(a % 2 == 0) {
			System.out.println("The given number "+a+" is even"); 
		}
		else
		{
			System.out.println("The given number "+a+" is odd");
		}

	}

}
