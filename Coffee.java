package chi;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Coffee {
    static Scanner sc = new Scanner(System.in);

    static void selectCoffee(ArrayList<Object> al) {

	System.out.println("Plaease select a number");
	System.out.println("------------------------");

	int selectOption = 0;
	try {

	    selectOption = sc.nextInt();
	    if (selectOption == 0) {
		Mainpaage.selectOrder();
		return;
	    }
	} catch (InputMismatchException e) {
	    System.out.println("Input type invalid!");
	    sc.next();
	    selectCoffee(al);
	    return;
	}

	int price;
	try {
	    price = Menu.coItems.get(al.get(selectOption - 1));
	    System.out.println("\nYou have selected: ");
	    System.out.println(selectOption + ". " + al.get(selectOption - 1) + "   ....................   ₹" + price);
	} catch (InputMismatchException e) {
	    System.out.println("Invalid input");
	    selectCoffee(al);
	    return;
	} catch (IndexOutOfBoundsException e) {
	    System.out.println("Invalid input");
	    selectCoffee(al);
	    return;
	}

	System.out.print("\nPlease select quantity: ");
	int quantity = sc.nextInt();
	System.out.println("\nYour bill for " + al.get(selectOption - 1) + " is: " + quantity + " X " + price + " = ₹"
		+ (price * quantity));
	Menu.bill.put((String) al.get(selectOption - 1),
		new Product((String) al.get(selectOption - 1), price, quantity));
	Menu.billist.add((String) al.get(selectOption - 1));
	System.out.println("\n111. back to recent-menu");
	System.out.println("0. back to main-menu");
	System.out.println("101. Exit");
	System.out.print("Please select an option=>");

	int dail = sc.nextInt();
	if (dail == 111) {
	    Menu.coffee();
	} else {
	    Menu.recentMenu(dail);
	}
    }

}
