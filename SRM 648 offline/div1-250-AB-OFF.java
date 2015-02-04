import java.util.*;

public class AB {

	String buildString(int a, int b) {
		StringBuilder s = new StringBuilder("");
		for (int i = 0; i < a; ++ i) {
			s.append("A");
		}
		for (int i = 0; i < b; ++ i) {
			s.append("B");
		}
		return s.toString();
	}
	
	int getK(int a, int b) { return a * b; }
	int getK(int a1, int b1, int a2, int b2) { return getK(a1, b1) + getK(a2, b2) + a1 * b2; }

	public String createString(int N, int K) {
		for (int a1 = 0; a1 <= N; ++ a1) {
			for (int b1 = 0; b1 <= N - a1; ++ b1) {
				if (a1 + b1 == N) {
					if (getK(a1, b1) == K) {
						return buildString(a1, b1);
					}
				}
				
				int n1 = a1 + b1;
				int N2 = N - n1;
				
				for (int a2 = 0; a2 <= N2; ++ a2) {
					int b2 = N2 - a2;
					if (getK(a1, b1, a2, b2) == K) {
						return buildString(a1, b1) + buildString(a2, b2);
					}
				}
			}
		}
		return "";
	}
}