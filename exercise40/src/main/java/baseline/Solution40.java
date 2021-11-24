package baseline;

import java.util.Scanner;

public class Solution40 {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        Employee e = new Employee();
        e.init();
        System.out.print("Enter in a search string: ");
        e.search(input.next());

    }
}
