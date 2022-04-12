package tamilnadu.Looping;

import java.util.Scanner;

public class Travel2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("you will travel now?");
		boolean t1 = sc.nextBoolean();

		System.out.println("which vechicle you choose?");
		String vechicle = sc.next();

		System.out.println("say your location and destination");
		String location = sc.next();

		System.out.println("How much you spend per day?");
		int ticket = sc.nextInt();

		System.out.println("If you have season ticket");
		boolean have = sc.nextBoolean();

		System.out.println("How much you pay for the season ticket?");
		int ssticket = sc.nextInt();

		System.out.print("How many days this ticket is valid?");
		int days = sc.nextInt();

		int withoutseasonticket = ticket * days;
		System.out.println("for 90 days if don't have season ticket you spend = " + withoutseasonticket);

		if (have == true) {
			System.out.println("How much you pay for the season ticket? = " + ssticket);
			System.out.print("How many days this ticket is valid?" + days);
			int profit = ((withoutseasonticket - ssticket));
			System.out.println("profit = " + profit);
			double percentage = (((profit * 100) / withoutseasonticket));
			System.out.println("profit%= " + percentage);
		} else {
			System.out.println("for 90 days if don't have season ticket you spend = " + withoutseasonticket);
		}
	}

}