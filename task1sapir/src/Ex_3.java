//task1 ex3 Eva Yonin and Yuval Madmon
import java.util.Scanner;
public class Ex_3 {
	public static void main(String[] args) {
		//creating a scanner object
		Scanner input = new Scanner(System.in);
		//defining an integer variable for Fahrenheit temperature
		int fahrenheit;
		//printing the option to enter an integer number
		System.out.println("Enter degrees (Fahrenheit):");
		//reading the number from user
		fahrenheit=input.nextInt();
		input.close();
		//defining a real number variable for calculating Celsius temperature 
		float celsius= ((fahrenheit-32)*5)/9f;
		//printing the result in Celsius
		System.out.println("Degrees (Celsius):" + celsius);
	}

}
