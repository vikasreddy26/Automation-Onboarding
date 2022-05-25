package Collections;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Collections;

public class CollectionsAll_Task {

    public static void main(String[] args) {
        System.out.println("******** ArrayList || LinkedList ********");
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(3, "Mano", "Cse"));
        arrayList.add(new Student(2, "Vikas", "Mech"));
        arrayList.add(new Student(1, "Reddy", "Civil"));
        System.out.println("Before Sorting ArrayList");
        for (Student list : arrayList) {
            System.out.println(list);
        }
        System.out.println("After Sorting Based On Id in ArrayList");
        Collections.sort(arrayList);
        for (Student list : arrayList) {
            System.out.println(list);
        }
        System.out.println("After Sorting Based On Name in ArrayList Using Comparator");
        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {

                return s1.name.compareTo(s2.name);
            }
        });
        for (Student list : arrayList) {
            System.out.println(list);
        }
        System.out.println("         LinkedList         ");
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Ravi");
        linkedList.add("Vijay");
        linkedList.add("Ajay");
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("Removed Ravi");
        linkedList.remove("Ravi");
        System.out.println("Added Vikas at 0 index");
        linkedList.add(0, "vikas");
        System.out.println("Iterating with ListIterator from reverse");
        ListIterator<String> listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println("********* HashMap || TreeMap || LinkedHashMap **********");
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        // Adding Key and Value pairs to HashMap
        hashmap.put(22, "A");
        hashmap.put(55, "B");
        hashmap.put(33, "Z");
        hashmap.put(44, "M");
        hashmap.put(99, "I");
        hashmap.put(88, "X");
        System.out.println("Iterating through Iterator");
        Set<Entry<Integer, String>> set = hashmap.entrySet();
        Iterator<Entry<Integer, String>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Entry<Integer, String> pair = iterator.next();
            System.out.print(pair.getKey() + ": ");
            System.out.println(pair.getValue());
        }
        System.out.println(" Iterating or looping using keySet() method");
        Set<Integer> keySet = hashmap.keySet();
        for (Integer key : keySet) {
            System.out.println(hashmap.get(key));
        }
        System.out.println(" Iterating or looping using entrySet() method");
        Set<Entry<Integer, String>> entrySet = hashmap.entrySet();
        for (Entry entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("Sorting Map Based on Key Using TreeMap");
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(hashmap);
        Set<Map.Entry<Integer, String>> set2 = treeMap.entrySet();
        Iterator<Entry<Integer, String>> itr = set2.iterator();
        while (itr.hasNext()) {
            Entry<Integer, String> entries = itr.next();
            System.out.println(entries.getKey() + " :: " + entries.getValue());
        }
        System.out.println(" Linked HashMap ");
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Yerra", 1);
        linkedHashMap.put("Mano", 2);
        linkedHashMap.put("Vikas", 3);
        linkedHashMap.put("Reddy", 4);
        for (String s : linkedHashMap.keySet()) {
            System.out.println(linkedHashMap.get(s));
        }
        System.out.println("******** HashSet || LinkedHashSet || TreeSet ********");
        HashSet<String> hashSet = new HashSet();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");
        System.out.println("      HashSet    ");
        Iterator<String> iter = hashSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(100);
        linkedHashSet.add(25);
        linkedHashSet.add(30);
        linkedHashSet.add(70);
        linkedHashSet.add(50);
        System.out.println("          LinkedHashSet before sorting        ");
        Iterator<Integer> lhitr = linkedHashSet.iterator();
        while (lhitr.hasNext()) {
            System.out.println(lhitr.next());
        }
        ArrayList<Integer> al = new ArrayList<>(linkedHashSet);
        Collections.sort(al);
        System.out.println("          LinkedHashSet after sorting        ");
        for (int j = 0; j < al.size(); j++) {
            System.out.println(al.get(j));
        }
        System.out.println("          TreeSet        ");
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Yerra");
        treeSet.add("Mano");
        treeSet.add("Vikas");
        treeSet.add("Reddy");
        System.out.println("Traversing element through Iterator in descending order");
        Iterator<String> tsi = treeSet.descendingIterator();
        while (tsi.hasNext()) {
            System.out.println(tsi.next());
        }
        System.out.println("Traversing element through Iterator in ascending order");
        Iterator<String> tsetIter = treeSet.iterator();
        while (tsetIter.hasNext()) {
            System.out.println(tsetIter.next());
        }
    }
}
