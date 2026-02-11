import java.util.Scanner;

public class FindMotif {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the big DNA string
        String big = input.nextLine();

        // Read the small DNA string (motif)
        String small = input.nextLine();

        // Start checking each position
        int i = 0;

        while (i <= big.length() - small.length()) {

            // Get part of the big string
            String part = big.substring(i, i + small.length());

            // Compare it to the motif
            if (part.equals(small)) {
                System.out.print(i + 1);
                System.out.print(" ");
            }

            i = i + 1;  // move to next position
        }
    }
}
