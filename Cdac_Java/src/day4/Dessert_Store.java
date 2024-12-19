package day4;

import java.util.Scanner;

public class Dessert_Store {
	
	public static void main(String[] args) {
		Cart cart=new Cart();
		boolean continueShopping = true;
		Scanner sc = new Scanner(System.in);
		
		do {	
				System.out.println("Enter the Dessert you want : Candies, Cookies, or Ice cream : ");
				String type = sc.next();
				int Quantity = 0;
				String Flavour = "";
				
				
			
			switch(type.toLowerCase()) {
			
			
			case "candies":
                Flavour = chooseFlavour(new String[]{"Chocolate", "Lemon", "Strawberry"});
                Quantity = getQuantity(sc);
                cart.addToCart(new Candies(Quantity, type, Flavour));
                break;
            case "cookies":
                Flavour = chooseFlavour(new String[]{"Chocolate Chip", "Oreo", "Peanut Butter"});
                Quantity = getQuantity(sc);
                cart.addToCart(new Cookies(Quantity, type, Flavour));
                break;
            case "icecream":
                Flavour = chooseFlavour(new String[]{"Vanilla", "Chocolate", "Mint"});
                Quantity = getQuantity(sc);
                cart.addToCart(new IceCream(Quantity, type, Flavour));
                break;
            default:
                System.out.println("Invalid dessert type. Please try again.");
                continue; // Skip to next iteration
            }

            cart.display_Cart();
            System.out.println("press 1 for more items or 0 for Exit");
			int button = sc.nextInt();
			if(button==1) {
				continueShopping = true;
				
			}else {
				continueShopping = false;
				System.out.println("Thank You for shopping! Aapka Din Shubh Rahe...!");
			}
		}while(continueShopping);
		
	}

        private static String chooseFlavour(String[] flavours) {
            System.out.println("Available flavors:");
            for (int i = 0; i < flavours.length; i++) {
                System.out.println((i + 1) + ". " + flavours[i]);
            }
            System.out.print("Choose a flavor (number): ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            return flavours[choice - 1]; // Return selected flavor
        }

        private static int getQuantity(Scanner sc) {
            System.out.print("Enter Quantity: ");
            return sc.nextInt();
        }
    }