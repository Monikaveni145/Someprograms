package tamilnadu.Looping;

import java.util.Scanner;

public class WhileloopTravel1 {
	public static void main(String[] args) {
		WhileloopTravel1 trvl1 = new WhileloopTravel1();
		Scanner sc = new Scanner(System.in);

		boolean train;
		boolean Bus = true;
		System.out.println(" if you travel in bus tell true " + '\n' + " if you travel in train tell false");
		boolean bt = sc.nextBoolean();
		Bus = bt;

		if (Bus == true) {
			System.out.println("Do you travel by bus daily");
			boolean bus = sc.nextBoolean();
			Bus = bus;

			String travel;
			System.out.println("first travel ");
			String travel1 = sc.next();
			travel = travel1;

			int busfair1 = 0;
			System.out.println("Busfair for the first bus ");
			int fair1 = sc.nextInt();
			busfair1 = fair1 * 2;

			String trvl;
			System.out.println("second travel");
			String travel2 = sc.next();
			trvl = travel2;

			int busfair2 = 0;
			System.out.println("Busfair for the second bus ");
			int fair2 = sc.nextInt();
			busfair2 = fair2 * 2;

			System.out.println("total working days per month ");
			int workingDaysPerMonth = sc.nextInt();

			int totalbusfair = (busfair1 + busfair2);
			System.out.println(totalbusfair);

			int withoutfreebus = totalbusfair - busfair2;
			System.out.println("freebus" + withoutfreebus);

			int profitforoneday = (fair2);
			System.out.println("profit for one = " + busfair2);

			int total = 0;
			int freeBusFairReduction = busfair2 * workingDaysPerMonth;
			System.out.println("total one month profit=" + freeBusFairReduction);
			int profit = (freeBusFairReduction);

			total = totalbusfair * workingDaysPerMonth;
			System.out.println("Total bus fair for one month with free bus = " + total);

			double percentage = ((profit * 100) / total);
			System.out.println("profit in percentage " + percentage);
		}

		if (Bus == false) {
			System.out.println("go to train");
		}
	}
}