package tamilnadu.Looping;

import java.util.Scanner;

public class Milkbuying {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String milk1 = "packet";
		String milk2 = "cow";
		String milk3 = "society";

		System.out.println("Do you buy milk every day? your ans is yes say true");
		boolean everyday = sc.nextBoolean();

		System.out.println("How many liters buying by oneday = ");
		int liters = sc.nextInt();
		// System.out.println(liters + "Liter");

		System.out.println("Which milk do you buy daily");
		String milk = sc.next();

		System.out.println("How many day buy milk in a month");
		int days = sc.nextInt();
		System.out.println("days = " + days);

		int cowmilkMonth = 0;
		if (milk2 == "cow") {
			System.out.println("cow milk price for one liter");
			int cowmilk = sc.nextInt();

			System.out.println("How many day buy milk in a month");
			System.out.println(days);

			System.out.println("cow milk for one month - price ");
			cowmilkMonth = cowmilk * days;
			System.out.println(cowmilkMonth + "one month - cow milk price");

			System.out.println("How many liters buying by oneday = " + liters);
			System.out.println("cow milk price for one liter = " + cowmilk);
			System.out.println("How many day buy milk in a month = " + days);
			System.out.println(cowmilkMonth + " = one month - packet milk price");

		}

		int societymilkMonth = 0;
		if (milk3 == "society") {
			System.out.println("society milk price for one liter");
			int societymilk = sc.nextInt();

			System.out.println("How many day buy milk in a month");
			System.out.println(days);

			System.out.println("society milk for one month - price ");
			societymilkMonth = societymilk * days;
			System.out.println(societymilkMonth + " = one month - packet milk price");

			System.out.println("How many liters buying by oneday = " + liters);
			System.out.println("society milk price for one liter = " + societymilk);
			System.out.println("How many day buy milk in a month = " + days);
			System.out.println(societymilkMonth + " = one month - packet milk price");

		}

		if (milk1 == "packet") {
			System.out.println("Packet milk price for one liter");
			int packetmilk = sc.nextInt();

			System.out.println("Packet milk for one month - price ");
			int packetmilkMonth = packetmilk * days;
			System.out.println(packetmilkMonth + "one month - packet milk price");

			System.out.println("How many liters buying by oneday = " + liters);
			System.out.println("Packet milk price for one liter = " + packetmilk);
			System.out.println("How many day buy milk in a month = " + days);
			System.out.println(packetmilkMonth + " = one month - packet milk price");

			int profitcowmilk = packetmilkMonth - cowmilkMonth;
			System.out.println("packet milk is compared to cowmilk total profit for one month =" + profitcowmilk);
			double percentagecowmilk = (((profitcowmilk * 100) / packetmilkMonth));
			System.out.println(
					"packet milk is compared to cowmilk total percentage for one month =" + percentagecowmilk + "%");

			int profitsocietymilk = packetmilkMonth - societymilkMonth;
			System.out.println("packet milk is compared to cowmilk total profit for one month =" + profitsocietymilk);
			double percentagesocietymilk = (((profitsocietymilk * 100) / packetmilkMonth));
			System.out.println("packet milk is compared to cowmilk total percentage for one month ="
					+ percentagesocietymilk + "%");

		}
	}
}
