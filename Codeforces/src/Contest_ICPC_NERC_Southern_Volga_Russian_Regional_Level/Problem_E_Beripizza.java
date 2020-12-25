package Contest_ICPC_NERC_Southern_Volga_Russian_Regional_Level;

import java.util.*;

public class Problem_E_Beripizza {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int Q = scan.nextInt();
		ArrayList<Integer> ans = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		PriorityQueue<Rank_money> pq = new PriorityQueue<Rank_money>();
		PriorityQueue<Integer>rank_queue = new PriorityQueue<>();
		
		HashMap<Integer,Rank_money> rmap = new HashMap<>();

		int rank = 1;

		for (int i = 1; i <= Q; i++) {
			int q1 = scan.nextInt();
			int m = 0;

			// If input is type 1
			if (q1 == 1) {
				m = scan.nextInt();
				map.put(rank, m);
				Rank_money rm = new Problem_E_Beripizza.Rank_money(rank, m);
				rmap.put(rank,rm);
				pq.add(rm);
				rank_queue.add(rank);
				rank++;
			}

			
			
			// If input is of type 2
			else if (q1 == 2) {
				if(!rank_queue.isEmpty()) {
					int rnk = rank_queue.poll();
					ans.add(rnk);
					map.remove(rnk);
					pq.remove(rmap.get(rnk));
				}
			}

			// If input is of type 3
			else if (q1 == 3) {
				if (!pq.isEmpty()) {
					int rnk = pq.poll().rank;
					ans.add(rnk);
					map.remove(rnk);
					rank_queue.remove(rnk);
				}
			}
		}
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
		scan.close();
	}

	static class Rank_money implements Comparable<Rank_money> {
		int rank;
		int money;

		public Rank_money(int r, int m) {
			this.rank = r;
			this.money = m;
		}

		public Rank_money() {
		}
		
		@Override
		public int compareTo(Rank_money o) {
			return o.money == this.money?this.rank-o.rank:o.money-this.money;
		}
	}

}
