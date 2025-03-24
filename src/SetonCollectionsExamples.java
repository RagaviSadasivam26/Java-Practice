import java.util.*;

public class SetonCollectionsExamples {
    public static void main(String[] args) {
        HashSetScenarios.addingElementstoaHashSet();
        HashSetScenarios.removingElementsfromaHashSet();
        HashSetScenarios.iteratingoveraHashSet();
        HashSetScenarios.CheckElementExists();
        HashSetScenarios.commonHashSetOperations();

        LinkedHashSetScenarios.addingElementsfromLinkedHashSet();
        LinkedHashSetScenarios.removingelementsfromLinkedHashSet();
        LinkedHashSetScenarios.iteratingoverLinkedHashSet();
        LinkedHashSetScenarios.checkElemetsfromLinkedHashSet();
        LinkedHashSetScenarios.convertingLinkedHashSettoanArray();

        TreeSetScenarios.basicTreeSet();
        TreeSetScenarios.treeSetWithComparator();
        TreeSetScenarios.treeSetWithStrings();
        TreeSetScenarios.iterateTreeSet();
        TreeSetScenarios.navigableTreeSet();
    }
}

class HashSetScenarios {
    static void addingElementstoaHashSet() {
        Set<String> car = new HashSet<>();
        car.add("Audi");
        car.add("Benz");
        car.add("MiniCooper");
        car.add("Volvo");
        car.add("Benz");

        System.out.println("Hashset Add Elements: " + car);
        System.out.println();
    }

    static void removingElementsfromaHashSet() {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Before Removal: " + numbers);
        numbers.remove(20);
        System.out.println("After Removal: " + numbers);
        System.out.println();
    }

    static void iteratingoveraHashSet() {
        Set<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.print("Iterating HashSet: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    static void CheckElementExists() {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        System.out.println("Contains 'Blue'? " + colors.contains("Blue"));
        System.out.println("Contains 'Yellow'? " + colors.contains("Yellow"));
        System.out.println();
    }

    static void commonHashSetOperations() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union: " + unionSet);

        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection: " + intersectionSet);

        Set<Integer> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println("Difference (set1 - set2): " + differenceSet);
        System.out.println();
        System.out.println();
    }
}

class LinkedHashSetScenarios {
    static void addingElementsfromLinkedHashSet() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Activa");
        set.add("Access");
        set.add("Jupiter");
        set.add("Access"); // Duplicate, ignored

        System.out.println(" after adding elements: " + set);
        System.out.println();
    }

    static void removingelementsfromLinkedHashSet() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.remove(20);

        System.out.println("after removing 20: " + set);
        System.out.println();
    }

    static void iteratingoverLinkedHashSet() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Elephant");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    static void checkElemetsfromLinkedHashSet() {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        set.add('A');
        set.add('B');
        set.add('C');

        System.out.println(" contain 'B'? " + set.contains('B'));
        System.out.println(" contain 'Z'? " + set.contains('Z'));
        System.out.println();
    }

    static void convertingLinkedHashSettoanArray() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        String[] array = set.toArray(new String[0]);

        System.out.print(" converted to Array: ");
        for (String color : array) {
            System.out.print(color + " ");
        }
        System.out.println();
        System.out.println();
    }
}

class TreeSetScenarios {
    static void basicTreeSet() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(30);
        set.add(10);
        set.add(50);
        set.add(20);

        System.out.println("Basic TreeSet: " + set);
        System.out.println();
    }

    static void treeSetWithComparator() {
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        set.add(30);
        set.add(10);
        set.add(50);
        set.add(20);

        System.out.println("TreeSet with Comparator (Descending Order): " + set);
        System.out.println();
    }

    static void treeSetWithStrings() {
        TreeSet<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Mango");
        set.add("Cherry");

        System.out.println("TreeSet with Strings: " + set);
        System.out.println();
    }

    static void iterateTreeSet() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(15);
        set.add(25);
        set.add(35);

        System.out.print("Iterating TreeSet: ");
        for (Integer num : set) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
    }

    static void navigableTreeSet() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("Lower than 30: " + set.lower(30));
        System.out.println("Higher than 30: " + set.higher(30));
        System.out.println("Floor of 35: " + set.floor(35));
        System.out.println("Ceiling of 35: " + set.ceiling(35));
        System.out.println();
    }

}