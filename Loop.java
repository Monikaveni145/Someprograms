package tamilnadu.Looping;

public class Loop {
	public static void main(String[] args) {
		Loop lp = new Loop();
		lp.loop1();
		lp.loop2();
		lp.loop3();
		lp.loop4();
		lp.loop5();
		lp.loop6();
		lp.loop7();
		lp.loop8();

	}

	private void loop1() {
		// TODO Auto-generated method stub
		int no = 1;
		while (no <= 5) {

			System.out.println(no);
			no++;
		}
		System.out.println("loop1");
	}

	private void loop2() {
		// TODO Auto-generated method stub
		int no = 1;
		while (no <= 5) {

			System.out.println(no * 2);
			no++;
		}
		System.out.println("loop2");
	}

	private void loop3() {
		// TODO Auto-generated method stub
		int no = 1;
		while (no <= 5) {

			System.out.println(no * 3);
			no++;
		}
		System.out.println("loop3");
	}

	private void loop4() {
		// TODO Auto-generated method stub
		int no = 1;
		while (no <= 5) {
			System.out.println(no * 4);
			no++;
		}
		System.out.println("loop4");
	}

	public void loop5() {
		int no = 1;
		while (no <= 5) {
			int power = (int) Math.pow(no, 2);
			System.out.println(power);
			no++;
		}
		System.out.println("loop5");
	}

	public void loop6() {
		int no = 1;
		while (no <= 5) {
			int power = (int) Math.pow(no, 3);
			System.out.println(power);
			no++;
		}
		System.out.println("loop6");
	}

	public void loop7() {
		int no = 1;
		while (no <= 5) {
			int power = (int) Math.pow(no, 4);
			System.out.println(power);
			no++;
		}
		System.out.println("loop7");
	}

	public void loop8() {
		int no = 1;
		while (no <= 5) {
			int power = (int) Math.pow(no, no);
			System.out.println(power);
			no++;
		}
		System.out.println("loop8");
	}

}
