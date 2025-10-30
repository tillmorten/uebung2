package h2;

public class H2_main {
	public static void main(String[] args) {

		int j = 8439485/84924, i = 8, k = -889238;


		int min = Math.min(i, Math.min(j, k));
		int max = Math.max(i, Math.max(j, k));

		System.out.println("i = " + i + ", j = " + j + ", k = " + k);
		System.out.println("Minimum = " + min);
		System.out.println("Maximum = " + max);

	}
}
