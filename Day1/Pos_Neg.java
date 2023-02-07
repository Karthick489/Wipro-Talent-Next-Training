import java.util.Scanner;

public class Pos_Neg {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner sc=new Scanner(System.in);5
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		if(a >= 0) {
			System.out.println("The given number "+a+" is Positive"); 
		}
		else
		{
			System.out.println("The given number "+a+" is Negative");
		}


	}

}
