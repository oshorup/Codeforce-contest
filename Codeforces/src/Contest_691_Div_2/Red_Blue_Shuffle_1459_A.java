package Contest_691_Div_2;
import java.util.*;
public class Red_Blue_Shuffle_1459_A {
	
	/*
	 * Explanation : Idea is simple, we only have to find the number of favourable cards for RED and for BLUE
	 * if Ri > Bi then that card is more favourable to RED 
	 * if Ri < Bi then that card is more favourable to BLUE
	 * if Ri = Bi then that card is equi-favourable to both RED and BLUE
	 *
	 *Here Ri(red number) and Bi(blue number) are the numbers on ith card
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=1;i<=T;i++) {
			int n = scan.nextInt();
			String red = scan.next();
			scan.nextLine();
			String blue = scan.next();
			scan.nextLine();
			
			int nR = 0, nB = 0;
			for(int j = 0;j< red.length();j++) {
				char r = red.charAt(j);
				char b = blue.charAt(j);
				
				if(r>b)nR++; //red favourable card
				if(r<b)nB++; // blue favourable card
			}
			
			if(nR>nB)System.out.println("RED");
			if(nR<nB)System.out.println("BLUE");
			if(nR==nB)System.out.println("EQUAL");
		}
		
		scan.close();
		
	}

}
