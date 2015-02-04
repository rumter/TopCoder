import java.util.*;

public class KitayutaMart2 {

	public int numBought(int K, int T) {
		double s = (T / K + 1);
		return (int)(Math.log(s) / Math.log(2));
	}
}