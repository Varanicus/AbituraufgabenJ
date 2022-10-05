package aufgabe1;

public class fibonacci {
	public static void main(String[] args) {
		long first = 0;
		long second = 1;
		long last = 1;
		long i = 0;	
		while (i < 200) {
			System.out.println((i + 1) + ".Stelle: " + last);
			last = first + second;
			first = second;
			second = last;
			i++;
		}
	}
}