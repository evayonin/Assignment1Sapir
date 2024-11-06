import java.util.Scanner;
public class lab2tirgul {

	public static void main(String[] args) {
    Scanner UserInput = new Scanner(System.in);
    
    int PriceChoco=11;
    int ChocoPacks;
    int TotalPrice;
    
    System.out.println("Please enter the quantity of chocolate packs:");
    ChocoPacks=UserInput.nextInt(); //read number from user
    
    TotalPrice = PriceChoco * ChocoPacks;

    System.out.println("Total price of chocolate is:" + TotalPrice);
    
    int PriceNuts=100;
    double Kilos;
    double TotalPrice1;
    
    System.out.println("Please enter the weight of pistachio in kilos:");
    Kilos=UserInput.nextDouble(); //read number from user
    
    TotalPrice1 = PriceNuts * Kilos; 
    
    System.out.println("Total price of pistachio is:" + TotalPrice1);
    
    double Sum; //total of order
    Sum = TotalPrice + TotalPrice1;
    System.out.println("The total of your order:" + Sum );
    
    UserInput.close();
	}

}
