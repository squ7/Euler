public class BreakOut {
	public static void main(String[] args){
	
		
		
			int sum = 0;
			int sum2 = 0;
			for (int i = 1; i <= 100; i++) {
				sum += i;
				sum2 += i * i;
			}
			/* 
			 * For the mathematically inclined:
			 *   sum  = N(N + 1) / 2.
			 *   sum2 = N(N + 1)(2N + 1) / 6.
			 */
			System.out.print("Euler 6: ");
			System.out.print(sum * sum - sum2);
		
	}
}
