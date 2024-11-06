//task1 ex4 Eva Yonin and Yuval Madmon
import java.util.Scanner;
public class Ex_4 {
	public static void main (String[] args) {
	//creating a scanner object
 	Scanner input = new Scanner(System.in);
 	//defining variables for the input real numbers, their average and STD
 	double num1, num2, num3, num4, num5, avrg, std;
 	//asking the user to enter 5 real numbers
 	System.out.println("Enter 5 real numbers:");
 	// reading numbers from user
 	num1=input.nextDouble();
 	num2=input.nextDouble();
 	num3=input.nextDouble();
 	num4=input.nextDouble();
 	num5=input.nextDouble();
 	input.close();
 	//defining a variable for the calculation of the average
 	avrg=(num1+num2+num3+num4+num5)/5;
 	//printing the result of the average
 	System.out.printf("Average: %.2f", avrg);
 	//calculating the STD using the formula, the Math.pow method for squaring and the Math.sqrt for the square root
 	std=(Math.pow(num1-avrg,2) + Math.pow(num2-avrg,2) + Math.pow(num3-avrg,2) + Math.pow(num4-avrg,2) + Math.pow(num5-avrg,2));
 	std=Math.sqrt(std/5);
 	//printing the result of STD
 	System.out.printf("\nSTD: %.2f", std);
 	}
}