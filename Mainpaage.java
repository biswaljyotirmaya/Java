package chi;

import java.util.Scanner;

public class Mainpaage {

    static Scanner sc = new Scanner(System.in);

    static void selectOrder() {
	switch (Menu.display()) {
	case 1: {
	    Menu.chi();
	    break;
	}
	case 2: {
	    Menu.coffee();
	    break;
	}
	case 3: {
	    Menu.lassi();
	    break;
	}
	case 4: {
	    Menu.iceCream();
	    break;
	}
	case 5: {
	    Menu.snacks();
	    break;
	}
	case 6: {
	    Menu.beverages();
	    break;
	}
	default:
	    System.out.println("Invalid input, please try with a valid input to order.");
	    selectOrder();
	}
    }

    public static void main(String[] args) {

	// Menu a = new Menu();
	System.out.println("A project inspired from Class presentation\n");
	System.out.println("======>>>>☕☕WELOCME TO FRIENDS  MASTI CHAI☕☕<<<<======\r\n" + "");
	System.out.println("----------------------------------------------------------");

	selectOrder();
    }

}
