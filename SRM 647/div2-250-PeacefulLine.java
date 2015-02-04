import java.util.*;

public class PeacefulLine {

	public String makeLine(int[] x) {
		int n = x.length;
		
		int N = 100;
		
		int c[] = new int[N];
		Arrays.fill(c, 0);
		for (int i = 0; i < n; ++ i) {
			++ c[x[i]];
		}
		
		int cnt = n;
		int prevX = 0;
		while (cnt > 0) {
			int iMax = - 1;
			int max = 0;
			for (int i = 0; i < N; ++ i) {
				if (i != prevX && c[i] > 0) {
					if (iMax == - 1 || c[i] > max) {
						iMax = i;
						max = c[i];
					}
				}
			}
			System.out.println(iMax);
			if (iMax == - 1) {
				break;
			}
			prevX = iMax;
			-- c[iMax];
			-- cnt;
		}
		
		boolean res = (cnt == 0);
		
		if (res) {
			return "possible";
		} else {
			return "impossible";
		}	
	}
}