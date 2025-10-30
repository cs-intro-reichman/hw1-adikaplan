// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * lim);
		int b = (int)(Math.random() * lim);
		int c = (int)(Math.random() * lim);
		int max_ab = Math.max(a,b);
		int max = Math.max(max_ab,c);
		int min_ab = Math.min(a,b);
		int min = Math.min(min_ab,c);
		int sum = a + b +c;
		int mid = sum - max - min;
		System.out.println(a + " " + b + " " + c);
		System.out.println(min + " " + mid + " " + max );
	}
}
