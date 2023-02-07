import java.util.Scanner;

public class sum_EvenOdd {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		if((a+b) % 2 == 0) {
			System.out.println("The given number "+(a+b)+" is even"); 
		}
		else
		{
			System.out.println("The given number "+(a+b)+" is odd");
		}
			// TODO Auto-generated method stub

		}
	}


