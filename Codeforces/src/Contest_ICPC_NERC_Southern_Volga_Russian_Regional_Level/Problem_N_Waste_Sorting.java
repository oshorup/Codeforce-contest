package Contest_ICPC_NERC_Southern_Volga_Russian_Regional_Level;

import java.util.*;

public class Problem_N_Waste_Sorting {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=1;i<=T;i++) {
			int c1 = scan.nextInt();
			int c2 = scan.nextInt();
			int c3 = scan.nextInt();
			
			int a1 = scan.nextInt();
			int a2 = scan.nextInt();
			int a3 = scan.nextInt();
			int a4 = scan.nextInt();
			int a5 = scan.nextInt();
			
			if(a1<=c1 && a2<=c2 && a3<=c3) {
				
				//first empty container specefic waste:remaining capacity of container
				c1 = c1-a1;
				c2 = c2-a2;
				c3 = c3-a3;
				
				a1=0;
				a2=0;
				a3=0;
				
				//If there is a4
				if(a4!=0) {
					if(a4>c1) {
						a4 = a4-c1;
						c1 = 0;
						if(a4>c3) {
							System.out.println("NO");
							continue;
						}else {
							c3 = c3-a4;
							a4 = 0;
						}
					}else {
						c1 = c1-a4;
						a4 = 0;
					}
				}
				
				//If there is a5
				if(a5!=0) {
					if(a5>c2) {
						a5 = a5-c2;
				        c2 = 0;
						if(a5>c3) {
							System.out.println("NO");
							continue;
						}else {
							c3 = c3-a5;
							a5 = 0;
						}
					}else {
						c2 = c2-a5;
						a5 = 0;
					}
				}
				
				if(a1==0 && a2==0 && a3==0 && a4==0 && a5==0) {
					System.out.println("YES");
				}
				
			}else {
				System.out.println("NO");
			}
		}
		scan.close();

	}

}
