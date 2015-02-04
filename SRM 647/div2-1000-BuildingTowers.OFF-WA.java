import java.util.*;

public class BuildingTowers {

	// const
	final long INF = (long) 1e20;
	
	// statement
	long N, K;
	List<Long> x, t;
	
	// result
	long res = 0;
	
	class Solution {
		public long countStepsInc;
		public long buildingX;
		public long buildingHeight;
		public long countDecSteps;
		public long lastDecStepHeight;
		public long lastBuildingHeight;
		public int lastBuildingIndex;
		public Solution() {}
		public Solution(long countStepsInc, long buildingX, long buildingHeight, long countDecSteps, long lastDecStepHeight, long lastBuildingHeight) {
			this.countStepsInc = countStepsInc;
			this.buildingX = buildingX;
			this.buildingHeight = buildingHeight;
			this.countDecSteps = countDecSteps;
			this.lastDecStepHeight = lastDecStepHeight;
			this.lastBuildingHeight = lastBuildingHeight;
		}
		public void p() {
			pv("countStepsInc", countStepsInc);
			pv("buildingX", buildingX);
			pv("buildingHeight", buildingHeight);
			pv("countDecSteps", countDecSteps);
			pv("lastDecStepHeight", lastDecStepHeight);
			pv("lastBuildingHeight", lastBuildingHeight);
			pv("lastBuildingIndex", lastBuildingIndex);
		}
	}

	Solution getCountSteps(long x1, long t1, long x2, long t2) {
		long maxHeight = t1 + (x2 - x1) * K;
		if (maxHeight <= t2) {
			return new Solution(x2 - x1, x2, maxHeight, 0L, 0L, maxHeight);
		}
		
		long diffHeight = t2 - t1;
		long decHeightK = K * (x2 - x1 - 1);
		
		long way = diffHeight + decHeightK;
		
		long countIncSteps = (long) Math.ceil((double)way / (double)K) / (long) 2;
		long buildingX = Math.max(x1, Math.min(x1 + countIncSteps, x2));
		
		countIncSteps = buildingX - x1;
		long buildingHeight = t1 + countIncSteps * K;
		
		long countDecSteps = (long) Math.floor((double)(buildingHeight - t2) / (double)K);
		long lastDecStepHeight = Math.max(0, buildingHeight - countDecSteps * K - t2);
		
		long lastBuildingHeight = t1 + countIncSteps * K - countDecSteps * K - lastDecStepHeight;
		
		// check
		{
			if (lastBuildingHeight > t2) {
				p("check lastBuildingHeight error!");
			}
			if (lastDecStepHeight < 0 || lastDecStepHeight > K) {
				p("check lastDecStepHeight error!");
			}
		}
		
		return new Solution(countIncSteps, buildingX, buildingHeight, countDecSteps, lastDecStepHeight, lastBuildingHeight);
	}
	
	Solution getCountSteps(int index) {
		int indexMinCountSteps = - 1;
		Solution minSolution = null;
		for (int i = index + 1; i < x.size(); ++ i) {
			Solution s = getCountSteps(x.get(index), t.get(index), x.get(i), t.get(i));
			if (indexMinCountSteps == - 1 || minSolution == null || ( s.countStepsInc < minSolution.countStepsInc )) {
				indexMinCountSteps = i;
				minSolution = s;
				minSolution.lastBuildingIndex = i;
			}
		}
		p("");
		pv("index", index);
		pv("x1", x.get(index));
		pv("t1", t.get(index));
		pv("x2", x.get(minSolution.lastBuildingIndex));
		pv("t2", t.get(minSolution.lastBuildingIndex));
		minSolution.p();
		p("");
		return minSolution;
	}
	
	public long maxHeight(int N1, int K1, int[] x1, int[] t1) {
		N = N1;
		K = K1;
		
		if (N == 1) {
			return 0;
		}
		
		x = new ArrayList<Long>();
		t = new ArrayList<Long>();
		
		x.add(1L);
		t.add(0L);
		
		if (x1.length == 0) {
			x.add(N);
			t.add(INF);
		} else {
			int n = x1.length;
			for (int i = 0; i < n; ++ i) {
				if (x1[i] != 1) {
					x.add((long) x1[i]);
					t.add((long) t1[i]);
				}
			}
			if (x1[n - 1] != N) {
				x.add(N);
				t.add(INF);
			}
		}
		
		pv("x", x);
		pv("t", t);
		
		for (int i = 0; i < x.size() - 1; ++ i) {
			Solution s = getCountSteps(i);
			
			t.set(s.lastBuildingIndex, s.lastBuildingHeight);
			
			res = Math.max(res, t.get(i));
			res = Math.max(res, s.lastBuildingHeight);
			res = Math.max(res, s.buildingHeight);
			
			i = s.lastBuildingIndex;
			-- i;
		}
		
		return res;
	}
	
	void p(Object value) {
		System.out.println(value);
	}
	
	void pv(Object key, Object value) {
		p(key + " = " + value);
	}
}