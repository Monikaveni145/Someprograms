package tamilnadu.Looping;

public class Loop2 {
public static void main(String[] args) {
	Loop2 lp = new Loop2();
	lp.loop1();
}

private void loop1() {
		int no = 1;
		while (no<=5){
			//Math.pow(no,2);
			System.out.println(no*2);
			no++;
		}
		System.out.println("loop5");
	}
	
}