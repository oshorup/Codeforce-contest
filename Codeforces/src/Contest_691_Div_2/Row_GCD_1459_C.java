package Contest_691_Div_2;
import java.util.*;
public class Row_GCD_1459_C {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int [] A = new int[n];
		int [] B = new int[m];
		for(int i=0;i<n;i++)A[i] = scan.nextInt();
		for(int j=0;j<m;j++)B[j] = scan.nextInt();
		scan.close();
		
		
	}

	private static int findGCDofROW(int [] arr) {
		
		int result = 0;
		for(int element : arr) {
			result = gcd(result, element); 
			
			if(result==1) {
				return 1;
			}
		}
		
		return result;
		
	}

	private static int gcd(int a, int b) {
		if(a == 0) {
			return b;
		}
		
		return gcd(b % a, a);
	}

}
