package by.htp.pizza;

public class Pizzeria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza pizza = new Pizza("Pepperoni", 45, 16, "Skryganova 14");
		Pizza pizza1 = new Pizza("Margarita", 25, 12, "Odoevskogo 81");
		Pizza pizza2 = new Pizza("Four seasons", 35, 18, "Nezavisimosti 186");

		pizza.OrderIt();
		System.out.println(pizza.getName() + " of size " + pizza.getSize() + " of price " + pizza.getPrice() + "BYN"
				+ " " + "has been ordered." + " ");

		pizza.OrderIt();
		System.out.println(pizza1.getName() + " of size " + pizza1.getSize() + " of price " + pizza1.getPrice() + "BYN"
				+ " " + "has been ordered." + " ");

		pizza.OrderIt();
		System.out.println(pizza2.getName() + " of size " + pizza2.getSize() + " of price " + pizza2.getPrice() + "BYN"
				+ " " + "has been ordered." + " ");

		System.out.println("______________________________________________");

		pizza.CookIt();
		System.out.println(pizza.getName() + " of size " + pizza.getSize() + " of price " + pizza.getPrice() + "BYN"
				+ " " + "has been cooked." + " ");

		pizza.CookIt();
		System.out.println(pizza1.getName() + " of size " + pizza1.getSize() + " of price " + pizza1.getPrice() + "BYN"
				+ " " + "has been cooked." + " ");

		pizza.CookIt();
		System.out.println(pizza2.getName() + " of size " + pizza2.getSize() + " of price " + pizza2.getPrice() + "BYN"
				+ " " +  "has been cooked." + " ");
		
		System.out.println("______________________________________________");
		
		pizza.DeliverIt();
		System.out.println(pizza.getName() + " of size " + pizza.getSize() + " of price " + pizza.getPrice() + "BYN"
				+ " " +  "will be delivered to" + " " + pizza.address + ".");
		
		pizza.DeliverIt();
		System.out.println(pizza1.getName() + " of size " + pizza1.getSize() + " of price " + pizza1.getPrice() + "BYN"
			+ " "	+ "will be delivered to" + " " + pizza1.address + ".");
		
		pizza.DeliverIt();
		System.out.println(pizza2.getName() + " of size " + pizza2.getSize() + " of price " + pizza2.getPrice() + "BYN"
				+ " " + "will be delivered to" + " " + pizza2.address + ".");
		
		System.out.println("================ENJOY YOUR PIZZA!==========================");

	}

}
