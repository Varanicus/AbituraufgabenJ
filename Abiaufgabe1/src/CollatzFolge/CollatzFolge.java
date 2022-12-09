package CollatzFolge;

public class CollatzFolge {
    public static void generate(int n) {
        System.out.println(n);



       // If n is 1, we're done
        if (n == 1) {
            return;
        }



       // If n is even, divide it by 2
        if (n % 2 == 0) {
            generate(n / 2);
        }
        // If n is odd, multiply it by 3 and add 1
        else {
            generate(3 * n + 1);
        }
    }



   public static void main(String[] args) {
        // Start with the number n = 1
        generate(100);
    }
}