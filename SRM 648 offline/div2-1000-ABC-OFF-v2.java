import java.util.*;

public class ABC {

	static class Solution {
		int a, b, c;
		int k;
		Solution() { a = b = c = k = 0; }
		Solution(int a, int b, int c) { this.a = a; this.b = b; this.c = c; this.k = a * (b + c) + b * c; }
		static int sum(Solution left, Solution right) {
			return left.k + right.k + left.a * (right.b + right.c) + left.b * right.c;
		}
		public String toString() {
			StringBuilder s = new StringBuilder("");
			for (int i = 0; i < a; ++ i) {
				s.append("A");
			}
			for (int i = 0; i < b; ++ i) {
				s.append("B");
			}
			for (int i = 0; i < c; ++ i) {
				s.append("C");
			}
			return s.toString();
		}
	}
	
	static class ArrSolution {
		List<Solution> list;
		int k;
		ArrSolution() { k = 0; list = new ArrayList<Solution>(); }
		void addRight(Solution s) {
			if (list.size () > 0) {
				for (Solution w : list) {
					k += Solution.sum(w, s) - w.k - s.k;
				}
			}
			k += s.k;
			list.add(s);
		}
		public String toString() {
			StringBuilder s = new StringBuilder("");
			if (list.size () > 0) {
				for (Solution w : list) {
					s.append(w.toString());
				}
			}
			return s.toString();
		}
	}
	
	public String createString(int N, int K) {		
		for (int a = 0; a <= N; ++ a) {
			for (int b = 0; b <= N - a; ++ b) {
				for (int c = 0; c <= N - a - b; ++ c) {
					int n1 = a + b + c;
					int N2 = N - n1;
					Solution s = new Solution(a, b, c);
					
					if (n1 == N && s.k == K) {
						return s + "";
					}
					
					for (int a2 = 0; a2 <= N2; ++ a2) {
						for (int b2 = 0; b2 <= N2 - a2; ++ b2) {
							int c2 = N2 - a2 - b2;
							Solution s2 = new Solution(a2, b2, c2);
							ArrSolution arr = new ArrSolution();
							arr.addRight(s);
							arr.addRight(s2);
								
							if (arr.k == K) {
								return arr + "";
							}
						}
					}
				}
			}
		}		
		return "";
	}
}