package chi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    static ArrayList<String> mItems = new ArrayList<String>();
    static HashMap<String, Integer> cItems = new HashMap<String, Integer>();
    static HashMap<String, Integer> coItems = new HashMap<String, Integer>();
    static HashMap<String, Integer> lItems = new HashMap<String, Integer>();
    static HashMap<String, Integer> iceItems = new HashMap<String, Integer>();
    static HashMap<String, Integer> sItems = new HashMap<String, Integer>();
    static HashMap<String, Integer> bItems = new HashMap<String, Integer>();
    static HashMap<String, Product> bill = new HashMap<String, Product>();
    static ArrayList<Object> billist = new ArrayList<Object>();

    static Scanner sc = new Scanner(System.in);

    static void loadChi() {
	cItems.put("Masala Tea", 20);
	cItems.put("Black Tea", 15);
	cItems.put("Green Tea", 20);
	cItems.put("Oolong Tea", 35);
	cItems.put("Mint Tea", 20);
	cItems.put("Ginger Tea", 25);
	cItems.put("Herbal Tea", 20);
	cItems.put("Pu-erh Tea", 35);
	cItems.put("Chai Latte", 40);
	cItems.put("Earl Grey", 40);
	cItems.put("Matcha", 20);
    }

    static void loadCoffee() {
	coItems.put("Arabica Coffee", 50);
	coItems.put("Robusta Coffee", 65);
	coItems.put("Espresso", 70);
	coItems.put("Filter Coffee", 35);
	coItems.put("French Roast", 50);
	coItems.put("Italian Roast", 65);
	coItems.put("Instant Coffee", 20);
	coItems.put("Cold Brew Coffee", 45);
	coItems.put("Café Cubano", 40);
	coItems.put("Black Coffee", 20);
	coItems.put("Cappuccino", 60);
    }

    static void loadlassi() {
	lItems.put("Sweet Lassi", 30);
	lItems.put("Salted Lassi", 25);
	lItems.put("Mango Lassi", 40);
	lItems.put("Strawberry Lassi", 45);
	lItems.put("Rose Lassi", 35);
	lItems.put("Mint Lassi", 30);
	lItems.put("Saffron Lassi", 50);
	lItems.put("Banana Lassi", 40);
	lItems.put("Chocolate Lassi", 45);
	lItems.put("Coconut Lassi", 35);
	lItems.put("Cardamom Lassi", 30);
    }

    static void loadice() {
	iceItems.put("Vanilla Ice Cream", 30);
	iceItems.put("Chocolate Ice Cream", 25);
	iceItems.put("Strawberry Ice Cream", 40);
	iceItems.put("Mango Ice Cream", 45);
	iceItems.put("Butter Pecan Ice Cream", 35);
	iceItems.put("Mint Chocolate Chip", 30);
	iceItems.put("Cookies and Cream", 50);
	iceItems.put("Rocky Road", 40);
	iceItems.put("Pistachio Ice Cream", 45);
	iceItems.put("Coffee Ice Cream", 35);
	iceItems.put("Caramel Ice Cream", 30);
    }

    static void loaddrinks() {
	bItems.put("Water", 10);
	bItems.put("Lemonade", 20);
	bItems.put("Soda", 30);
	bItems.put("Orange Juice", 35);
	bItems.put("Smoothie", 60);
	bItems.put("Hot Chocolate", 45);
	bItems.put("Masala Soda", 25);
	bItems.put("Ginger Lemonade", 25);
	bItems.put("Mint Lemonade", 25);
	bItems.put("Jaljeera", 20);
	bItems.put("Aam Panna", 30);
    }

    static void loadSnacks() {
	sItems.put("Samosa", 15);
	sItems.put("Pakora", 20);
	sItems.put("Aloo Tikki", 25);
	sItems.put("Chaat", 30);
	sItems.put("Pav Bhaji", 40);
	sItems.put("Vada Pav", 20);
	sItems.put("Dhokla", 30);
	sItems.put("Pani Puri", 25);
	sItems.put("Bhel Puri", 20);
	sItems.put("Sev Puri", 25);
	sItems.put("Kachori", 20);
    }

    static int display() {

	System.out.println("         ----------------------------");
	System.out.println("              ⭆⭆⭆Main menu⭅⭅⭅");
	System.out.println("         ----------------------------");
	System.out.println("Please Choose Your  Order");
	System.out.println("1. Chi(Tea)");
	System.out.println("2. Coffee");
	System.out.println("3. Lassi");
	System.out.println("4. Ice Cream");
	System.out.println("5. Snacks");
	System.out.println("6. Beverages");
	System.out.println();
	System.out.println("Plaease enter your order in a valid number");
	System.out.println("=->");
	return sc.nextInt();
    }

    static void chi() {
	System.out.println("         ----------------------------");
	System.out.println("              ⭆⭆⭆Chai(Tea)⭅⭅⭅");
	System.out.println("         ----------------------------");

	loadChi();
	ArrayList<Object> al = new ArrayList<Object>(cItems.keySet());
	for (Object o : al) {
	    System.out.println((al.indexOf(o) + 1) + ". " + o + "   ....................   ₹" + cItems.get(o));
	}
	System.out.println("0. Back to Main-menu");
	System.out.println();
	Chi.selectChi(al);
    }

    static void coffee() {
	System.out.println("           ----------------------------");
	System.out.println("                ⭆⭆⭆Coffee⭅⭅⭅");
	System.out.println("           ----------------------------");

	loadCoffee();
	ArrayList<Object> al = new ArrayList<Object>(coItems.keySet());
	for (Object o : al) {
	    System.out.println((al.indexOf(o) + 1) + ". " + o + "   ....................   ₹" + coItems.get(o));
	}

	System.out.println("0. Back to Main-menu");
	System.out.println();
	Coffee.selectCoffee(al);
    }

    static void lassi() {
	System.out.println("          ----------------------------");
	System.out.println("                ⭆⭆⭆Lassi⭅⭅⭅");
	System.out.println("          ----------------------------");

	loadlassi();
	ArrayList<Object> al = new ArrayList<Object>(lItems.keySet());
	for (Object o : al) {
	    System.out.println((al.indexOf(o) + 1) + ". " + o + "   ....................   ₹" + lItems.get(o));
	}

	System.out.println("0. Back to Main-menu");
	System.out.println();
	Lassi.selectLassi(al);
    }

    static void iceCream() {
	System.out.println("           ----------------------------");
	System.out.println("               ⭆⭆⭆Ice Cream⭅⭅⭅");
	System.out.println("           ----------------------------");

	loadice();
	ArrayList<Object> al = new ArrayList<Object>(iceItems.keySet());
	for (Object o : al) {
	    System.out.println((al.indexOf(o) + 1) + ". " + o + "   ....................   ₹" + iceItems.get(o));
	}

	System.out.println("0. Back to Main-menu");
	System.out.println();
	Icecream.selectIcecream(al);
    }

    static void snacks() {
	System.out.println("            ----------------------------");
	System.out.println("                   ⭆⭆⭆Snacks⭅⭅⭅");
	System.out.println("            ----------------------------");

	loadSnacks();
	ArrayList<Object> al = new ArrayList<Object>(sItems.keySet());
	for (Object o : al) {
	    System.out.println((al.indexOf(o) + 1) + ". " + o + "   ....................   ₹" + sItems.get(o));
	}

	System.out.println("0. Back to Main-menu");
	System.out.println();
	Snacks.selectSnacks(al);
    }

    static void beverages() {
	System.out.println("----------------------------");
	System.out.println("     ⭆⭆⭆ Beverages ⭅⭅⭅");
	System.out.println("----------------------------");

	loaddrinks();
	ArrayList<Object> al = new ArrayList<Object>(bItems.keySet());
	for (Object o : al) {
	    System.out.println((al.indexOf(o) + 1) + ". " + o + "   ....................   ₹" + bItems.get(o));
	}

	System.out.println("0. Back to Main-menu");
	System.out.println();
	Beverages.selectBeverages(al);
    }

    static void printBil() {
	int amount = 0;
	ArrayList<Object> b = new ArrayList<Object>(Menu.bill.keySet());
	System.out.println("\n\n----------------------------------------------------");
	System.out.println("=========>>>>☕☕FRIENDS  MASTI CHAI☕☕<<<<=========" + "");
	System.out.println("----------------------------------------------------");
	System.out.println("Bill no: " + (int) (Math.floor(Math.random() * 10000)));
	System.out.println("Date: " + LocalDate.now() + "                     Time: "
		+ LocalTime.now().toString().substring(0, 8) + "\n");
	for (Object o : b) {
	    int total = Menu.bill.get(o).iPrice * Menu.bill.get(o).qunt;
	    System.out.println((b.indexOf(o) + 1) + ". " + String.format("%-20s", o) + "..........  "
		    + Menu.bill.get(o).qunt + " X " + Menu.bill.get(o).iPrice + " = ₹" + total);
	    amount += total;
	}
	System.out.println("\n----------------------------------------------------");
	System.out.println("Total                                       ₹" + amount);
	System.out.println("----------------------------------------------------");
	System.out.println("Please collect your invoice from the counter!");
    }

    static void recentMenu(int dial) {
	if (dial == 0) {
	    Mainpaage.selectOrder();
	} else if (Menu.bill.size() != 0) {
	    Menu.printBil();
	} else {
	    System.out.println("\nThank you visit again.");
	}
    }
}
