// task1 ex2 Yuval Madmon and Eva Yonin
import java.util.Scanner;
public class Ex_2 {
	public static void main (String[] args) {
		//creating a scanner object
		Scanner input = new Scanner (System.in); 
		// defining 4 variables
		int num , digit1 , digit2 , digit3 ;
		//asking the user to enter a 3 digit number
		System.out.println("Enter a number with 3 digits");
		//reading the number from the user
		num = input.nextInt();
		input.close();
		//dividing and using modulus operation so that each digits is increased by 1, if the digit was 9 it becomes 0
		digit1 = ((num % 10) +1 ) % 10 ;
		digit2 = (((num / 10) % 10) + 1 ) % 10 ;
		digit3 = (((num / 100) % 10 ) + 1 ) % 10 ;
		//printing the result in one line so that it appears as a three-digit number 
		System.out.print(digit3);
		System.out.print(digit2);
		System.out.print(digit1);
	}

} 