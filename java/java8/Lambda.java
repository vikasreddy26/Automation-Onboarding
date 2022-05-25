package java8;

import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.*;
import java.util.function.Predicate;
public class Lambda {

    public static void main(String[] args) {
        Predicate<String> palindrome = (str) -> {
            String rev = "";
            boolean flag = false;
            for (int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }
            if (str.equals(rev)) {
                flag = true;
            }
            return flag;
        };
        System.out.println(palindrome.test("vikas"));

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(8);
        arrayList.add(22);
        arrayList.add(15);
        System.out.println(arrayList);
        Comparator comparator = Collections.reverseOrder();
        Collections.sort(arrayList, comparator);
        System.out.println(arrayList);

        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.add(new Employee(1, "mano", "Testing"));
        linkedList.add(new Employee(2, "vikas", "developing"));
        linkedList.add(new Employee(3, "reddy", "hr"));
        Comparator<Employee> comp = (e1, e2) -> {
            return e1.name.compareTo(e2.name);
        };
        Collections.sort(linkedList, comp);
        System.out.println("************** Ascending order by name ************");
        System.out.println(linkedList);

        Comparator<Employee> desc = (e1, e2) -> {
            return e2.name.compareTo(e1.name);
        };
        Collections.sort(linkedList, desc);
        System.out.println("************** Descending order by name ************");
        System.out.println(linkedList);

        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
        treeSet.add("Yerra");
        treeSet.add("Mano");
        treeSet.add("Vikas");
        System.out.println("************ Sorted TreeSet in Descending Oder ***********");
        for (String s : treeSet) {
            System.out.println(s);
        }

        TreeSet<Employee> emp = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        });
        Employee e1 =new Employee(1, "Mano", "Testing");
        Employee e2 =new Employee(2, "Vikas", "Developer");
        Employee e3 =new Employee(3, "Reddy", "Devops");
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        System.out.println("************ Sorted Employee TreeSet in Ascending Oder By Name ***********");
        for (Employee e : emp) {
            System.out.println(e);
        }

    }

}


