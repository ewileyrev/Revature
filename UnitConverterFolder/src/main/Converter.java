package main;
import java.util.Scanner;


public class Converter {
	//conversions
	public void cups(double x) {
		double y = x/48;
		System.out.println(String.format("%.2f",y)+" Cups");
	}
	
	public void Teaspoons(double x) {
		double y = x*48;
		System.out.println(String.format("%.2f",y)+" Teaspoons");
	}
	
	public void Kilometers(double x) {
		double y = x*1.609;
		System.out.println(String.format("%.2f",y)+" Kilometers");
	}
	
	public void miles(double x) {
		double y = x/1.609;
		System.out.println(String.format("%.2f",y)+" Miles");
	}
	
	public void imperialGallons(double x) {
		double y = x/1.201;
		System.out.println(String.format("%.2f",y)+" Imperial Gallons");
	}
	
	public void usGallons(double x) {
		double y = x*1.201;
		System.out.println(String.format("%.2f",y)+" US Gallons");
	}
	
	
	
	public static void main(String[] args) {
		
		int menuSelection=1;		
		String option = null;
		int lastSelection = 0;
		
		while(menuSelection != 7){
			//Print out options and ask for selection
			System.out.println("Please select an conversion");
			System.out.println("1. Teaspoons to Cups");
			System.out.println("2. Cups to Teaspoons");
			System.out.println("3. Miles to Kilometers");
			System.out.println("4. Kilometers to Miles");
			System.out.println("5. US Gallons to Imperial Gallons");
			System.out.println("6. Imperial Gallons to US Gallons");
			System.out.println("7. Quit");

		
			//Get user units
			Scanner s = new Scanner(System.in);
			option = s.nextLine();
			int option1 = Integer.parseInt(option);
			if(option1 < 8 && option1 > 0) {
			menuSelection = lastSelection;
		}
		
			System.out.println("Please enter the value");
			Scanner v = new Scanner(System.in);
			String value1 = v.nextLine();
			double value = Double.parseDouble(value1);
			
			//use user input to do calculations
			Converter md = new Converter();
			switch(option) {
			case "1":
				md.cups(value);
				break;
			case "2":
				md.Teaspoons(value);
				break;
			case "3":
				md.Kilometers(value);
				break;
			case "4":
				md.miles(value);
				break;
			case "5":
				md.imperialGallons(value);
				break;
			case "6":
				md.usGallons(value);
				break;
			case "7":
				System.out.println("Quitting");
				break;
			default:
				System.out.println("Not a valid option");
				System.out.println("Quitting");
				break;
			}
		}
			return;
			}
	
	
	
}
