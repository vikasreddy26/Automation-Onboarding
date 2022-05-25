package Collections;

import java.util.HashMap;
import java.util.Scanner;

public class Map {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of entries");
        int n = scanner.nextInt();
        scanner.nextLine();
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Now Enter the Entries into PhoneBook");
            String name = scanner.nextLine();
            int number = scanner.nextInt();
            phoneBook.put(name, number);
            scanner.nextLine();
        }
        System.out.println("Enter query name");
        while (scanner.hasNext()) {
            String name = scanner.nextLine();
            try {
                int number = phoneBook.get(name);
                System.out.println(name + " = " + number);
            } catch (NullPointerException e) {
                System.out.println("Not found");
            }
        }
    }
}
