package Collections;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Test Cases");
        int testcases = scan.nextInt();
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int j = 1; j <= testcases; j++) {
            System.out.println("Test Case No : " + j);
            System.out.println("Enter number of queries");
            scan.nextLine();
            int queries = scan.nextInt();
            for (int i = 1; i <= queries; i++) {
                System.out.println("Enter query number");
                int q = scan.nextInt();
                switch (q) {
                    case 1:
                        System.out.println("Enter key and value");
                        scan.nextLine();
                        String key = scan.nextLine();
                        int value = scan.nextInt();
                        map.put(key, value);
                        break;
                    case 2:
                        scan.nextLine();
                        System.out.println("Enter key to print");
                        String printKeyValue = scan.nextLine();
                        if (map.containsKey(printKeyValue)) {
                            System.out.println("Value of given key is :" + map.get(printKeyValue));
                        } else
                            System.out.println(-1);
                        break;
                    case 3:
                        System.out.println("Size of a Map is : " + map.size());
                        break;
                    case 4:
                        System.out.println("Enter Key Name to remove");
                        String keyremove = scan.nextLine();
                        map.remove(keyremove);
                        System.out.println(keyremove + " Key Is Removed");
                        break;
                    case 5:
                        System.out.println("Map in Sorted Key Oder");
                        Set<Map.Entry<String, Integer>> entries = map.entrySet();
                        for (Map.Entry entry : entries) {
                            System.out.println(entry.getKey() + "  ||  " + entry.getValue());
                        }
                        break;
                }
            }
            map.clear();
        }
    }
}
