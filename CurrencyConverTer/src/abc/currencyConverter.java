package abc;

import java.util.*;
public class currencyConverter {

     public static ArrayList<String> Currency=new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		boolean running=true;
		
		while (running) {
			System.out.println("options");
			System.out.println("1. Add currency to favourites");
			System.out.println("2. view favourite curriences");
			System.out.println("3. Convert currency");
			System.out.println("4.Exit");
			System.out.println("Select an option");
			
			int choice =sc.nextInt();
			
			switch(choice) {
			case 1:
				addCurrency();
				break;
			case 2:
				viewCurrency();
				break;
			case 3:
				currencyConversion();
				break;
			case 4:
				running =false;
				System.out.println("Exiting..");
				break;
				default:
				System.out.println("Invalid option. Please choose a valid option.");	
				
			}
		}
	}
			public static void currencyConversion() {
				System.out.println("1 Rupee");
				System.out.println("2 Dollar");
				System.out.println("3 Euro");
				
				Scanner sc =new Scanner (System.in);
				System.out.println("Choose the currency");
				
				int choice=sc.nextInt();
				System.out.println("Enter the amount");
				
				double amount =sc.nextDouble();
				
				switch (choice) {
				case 1:
					rupeeToOther(amount);
					break;
				case 2:
					DollarToOther(amount);
					break;
				case 3:
					euroToOther(amount);
					break;
					default:
						System.out.println("Invalid Choice");
						
				}
				
			}
	
	public static void addCurrency() {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the currency");
		String choice = sc.next();
		Currency.add(choice);
		System.out.println(choice + "added to favorites");
	}
	public static void viewCurrency() {
		if (Currency.isEmpty()) {
			System.out.println("You haven't added any Favourite currencies yet.");
		}else {
			System.out.println("Favourite Currencies:");
			for (String currency: Currency) {
				
				System.out.println(currency);
			}
		}
	}
	public static void rupeeToOther (double amt) {

		System.out.println("1 Ruppe = 0.013 Dollar");
		System.out.println();
		System.out.println(amt + " Ruppe = " + (amt* 0.013)+" Dollar");
		System.out.println();
		System.out.println("1 Ruppe 0.012 Euro");
		System.out.println();
		System.out.println (amt + " Ruppe = " + (amt* 0.012)+" Euro");
	    System.out.println();
	}
	public static void DollarToOther (double amt) {


		System.out.println("1 Dollar = 79.37 Ruppe");


		System.out.println();
		System.out.println(amt + " Dollar = " + (amt * 79.37)+"Ruppe");
		System.out.println();
		System.out.println("1 Dollar 0.98 Euro");
		System.out.println();
		System.out.println(amt + " Dollar = " + (amt * 0.98)+"Euro");

		}

		public static void euroToOther (double amt) {

		System.out.println("1 Euro 80.85 Ruppe");
		System.out.println();
		System.out.println(amt + " Euro = " + (amt*80.85) + " Ruppe");
		System.out.println();
		System.out.println("1 Euro 1.02 Dollar");
        System.out.println();
		System.out.println(amt + " Euro = " + (amt*1.02)+" Dollar");
		}
}

