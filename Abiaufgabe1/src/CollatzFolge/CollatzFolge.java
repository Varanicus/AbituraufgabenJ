package CollatzFolge;

public class CollatzFolge {
	public static void generate(int n) {
		System.out.println(n);

		if (n == 1) {
			return;
		}

		if (n % 2 == 0) {
			generate(n / 2);
		}

		else {
			generate(3 * n + 1);
		}
	}

	public static void main(String[] args) {

		generate(100);
	}
}