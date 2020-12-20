package Contest_692_Div_2;

import java.util.Scanner;

public class Fair_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i = 1; i <= T; i++) {

			long n = scan.nextLong();
			String str = n + "";
			long ans = findFairNum(n, str);
			System.out.println(ans);

		}

	}

	private static long findFairNum(long num, String str) {

		boolean isFair = false;
		int i=0;
		while(i<str.length() && !isFair) {
			int digit = str.charAt(i) - '0';
			if(digit==0) {
				i++;
				continue;
			}
			if (num % digit == 0) {
				i++;
				continue;
			} else {
				num = num+1;
				str = num+"";
				i = 0;
			}
		}
		return num;
	}

}
