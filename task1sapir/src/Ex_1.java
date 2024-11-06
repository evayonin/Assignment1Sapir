//task1 ex1 Eva Yonin and Yuval Madmon
import java.util.Scanner;
public class Ex_1 {
	public static void main (String[] args) {
		//creating a scanner object
		Scanner input = new Scanner(System.in);
		//defining 3 variables for integers
		int num1 , num2 , num3;
		//printing the option to enter 3 integers
		System.out.print("Please enter 3 integers:");
		//reading numbers from user
		num1 =input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		input.close();
		//defining a variable for each arithmetic
		int multiplication= num1*num2*num3; //multiplying operation
		int subtraction= (num1-num2)-num3; //subtraction operation
		double division= (num1/num2)/num3; // division operation
		int modulo= (num1%num2)%num3; //modulo operation
		
		//printing the results
		System.out.println("Result of multuplication:" + multiplication);
		System.out.println("Result of subtraction:" + subtraction);
		System.out.println("Result of division:" + division);
		System.out.println("Result of modulo:" + modulo);
		
	}

}