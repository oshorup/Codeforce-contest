package Contest_692_Div_2;

import java.util.Scanner;

public class In_game_chat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=1;i<=T;i++) {
			int n = scan.nextInt();
			String str = scan.next();
			scan.nextLine();
			
			int count = 0;
			int j = str.length()-1;
			for(;j>=0;j--) {
				char c = str.charAt(j);
				if(c==')')count++;
				else break;
			}
			
			String rem = str.substring(0,j+1);
			if(rem.length()>=count)System.out.println("NO");
			else System.out.println("YES");
		}
		
		scan.close();

	}

}
