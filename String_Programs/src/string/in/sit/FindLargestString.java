package string.in.sit;

import java.util.Scanner;

public class FindLargestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of strings: ");
        int n = scanner.nextInt();
         scanner.nextLine(); // Consume newline

        String[] strings = new String[n];

        // Input strings
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        // Find largest string
        String largest = strings[0];
        for (int i = 1; i < n; i++) {
            if (strings[i].compareTo(largest) > 0) {
                largest = strings[i];
            }
        }

        System.out.println("Largest string: " + largest);
    }
}

