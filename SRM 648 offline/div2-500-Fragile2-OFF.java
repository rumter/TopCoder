import java.util.*;

public class Fragile2 {
	
	int n;
	String[] g;
	int u, v;
	boolean[] is;
	
	void dfs(int q) {
		is[q] = true;
		for (int i = 0; i < n; ++ i) {
			if (i != u && i != v && !is[i]) {
				if (g[q].charAt(i) == 'Y') {
					dfs(i);
				}
			}
		}
	}
	
	int countConnComp(int u, int v) {
		this.u = u;
		this.v = v;
		
		Arrays.fill(is, false);
		int cnt = 0;
		
		for (int i = 0; i < n; ++ i) {
			if (i != u && i != v && !is[i]) {
				++ cnt;
				dfs(i);
			}
		}
		return cnt;
	}

	public int countPairs(String[] graph) {
		n = graph.length;
		g = graph;
		is = new boolean[n];
		
		int count = 0;
		
		int initCnt = countConnComp(- 1, - 1);
		
		for (int i = 0; i < n; ++ i) {
			for (int j = i + 1; j < n; ++ j) {
				int cnt = countConnComp(i, j);
				if (cnt > initCnt) {
					++ count;
				}
			}
		}
		
		return count;
	}
}