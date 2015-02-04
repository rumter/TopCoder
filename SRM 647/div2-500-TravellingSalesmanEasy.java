import java.util.*;

public class TravellingSalesmanEasy {

	public int getMaxProfit(int M, int[] profit, int[] city, int[] visit) {
		int n = profit.length;
		int m = M;
		
		for (int i = 0; i < n; ++ i) {
			for (int j = i + 1; j < n; ++ j) {
				if (profit[i] < profit[j]) {
					int t = profit[i];
					profit[i] = profit[j];
					profit[j] = t;
					t = city[i];
					city[i] = city[j];
					city[j] = t;
				}
			}
		}
		
		LinkedList<Integer> items[] = new LinkedList[M + 100];
		for(int i = 1; i <= m; ++ i) {
			items[i] = new LinkedList<Integer>();
		}
		
		for (int i = 0; i < n; ++ i) {
			items[city[i]].add(profit[i]);
		}
		
		int total = 0;
		for (int i = 0; i < visit.length; ++ i) {
			int j = visit[i];
			if (items[j].size() > 0) {
				total += items[j].poll();
			}
		}
		return total;
	}
}