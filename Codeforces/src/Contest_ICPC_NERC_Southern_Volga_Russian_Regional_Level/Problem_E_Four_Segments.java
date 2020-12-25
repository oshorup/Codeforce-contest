package Contest_ICPC_NERC_Southern_Volga_Russian_Regional_Level;
import java.util.*;
public class Problem_E_Four_Segments {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=1;i<=T;i++) {
			ArrayList<Integer>list = new ArrayList<>();
			for(int j=0;j<4;j++) {
				int seg = scan.nextInt();
				list.add(seg);
			}
			Collections.sort(list);
			int length = Math.min(list.get(2), list.get(3));
			int breadth = Math.min(list.get(0), list.get(1));
			
			System.out.println(length*breadth);
			
		}
		scan.close();
	}

}
