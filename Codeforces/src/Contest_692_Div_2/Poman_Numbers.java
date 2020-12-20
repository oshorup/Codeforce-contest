package Contest_692_Div_2;

import java.util.HashMap;
import java.util.Scanner;

public class Poman_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int T = scan.nextInt();

		String S = scan.next();
		scan.nextLine();
		scan.close();

		if (S.length() <= 1) {
			int pos = S.charAt(0) - 'a';
			int value = (int) Math.pow(2, pos);

			if (value == T)
				System.out.println("YES");
			else
				System.out.println("NO");
		} else {
			boolean isPossible = false;
			HashMap<String, Integer>dp = new HashMap<>();
			for (int m = 1; m < S.length(); m++) {
				String first = S.substring(0, m);
				String second = S.substring(m);
				
				int temp = -helper(first,dp) + helper(second,dp);
				//dp.clear();
				if (temp == T) {
					isPossible = true;
					System.out.println("YES");
					break;
				}

			}
			if (!isPossible)
				System.out.println("NO");
		}

	}

	private static int helper(String str, HashMap<String,Integer>dp) {

		if (str.length() <= 1) {
			int pos = str.charAt(0) - 'a';
			int value = (int) Math.pow(2, pos);
			return value;
		}
		
		if(dp.containsKey(str))return dp.get(str);

		char c = str.charAt(0);
		String rem = str.substring(1);

		int pos = c - 'a';
		int value = (int) Math.pow(2, pos);

		int ans = -value + helper(rem,dp);
		dp.put(str,ans);
		return ans;
	}

}
