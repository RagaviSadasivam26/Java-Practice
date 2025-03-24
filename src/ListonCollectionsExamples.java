import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ListonCollectionsExamples {
    public static void main(String[] args) {
        ArrayListScenarios.basicArrayListOperations();
        ArrayListScenarios.iteratingoveranArrayList();
        ArrayListScenarios.sortinganArrayList();
        ArrayListScenarios.removingElementsfromanArrayList();
        ArrayListScenarios.usingArrayListwithCustomObjects();

        LinkedListScenarios.basicLinkedListOperations();
        LinkedListScenarios.iteratingoveranLinkedList();
        LinkedListScenarios.usingLinkedListaaQueue();
        LinkedListScenarios.usingLinkedListasaStack();
        LinkedListScenarios.sortingaLinkedList();

        VectorScenarios.basicVectorOperations();
        VectorScenarios.accessingElements();
        VectorScenarios.sortingVector();
        VectorScenarios.checkElementExistence();
        VectorScenarios.vectorAsStack();

        StackScenarios.stackUsingStackClass();
        StackScenarios.stackUsingArrayDeque();
        StackScenarios.stackUsingLinkedList();
        StackScenarios.stackUsingCustomArrayStack();

    }
}

class ArrayListScenarios{
    static void basicArrayListOperations(){
        ArrayList<String> Fruits = new ArrayList<String>();
        Fruits.add("Apple");
        Fruits.add("Banana");
        Fruits.add("Grapes");
        Fruits.add("Orange");

        System.out.println("Fruits: " + Fruits);
        System.out.println("Modify First Element: " + Fruits.get(0));
        Fruits.set(0, "Kiwi");
        System.out.println("Modified Fruits: " + Fruits);
        System.out.println("Size of Fruits: " + Fruits.size());
    }

    static void  iteratingoveranArrayList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 10, 20, 30, 40, 50);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");
    }

    static void sortinganArrayList() {
        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "John", "Alice", "Bob", "David");

        System.out.println("Before Sorting: " + names);
        Collections.sort(names);
        System.out.println("After Sorting: " + names);
        System.out.println();
    }

    static void removingElementsfromanArrayList() {

        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6);

        System.out.println("Original List: " + numbers);
        numbers.remove(2);
        System.out.println("After Removing Index 2: " + numbers);
        numbers.remove(Integer.valueOf(5));
        System.out.println("After Removing Element 5: " + numbers);
        System.out.println();
    }

    static void usingArrayListwithCustomObjects() {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 21));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 20));

        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println();
    }

}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

class LinkedListScenarios{
    static void basicLinkedListOperations() {
        java.util.LinkedList<String> list = new java.util.LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.addFirst("Mango");
        list.addLast("Orange");

        System.out.println("LinkedList: " + list);
        list.remove(2);
        list.remove("Banana");

        System.out.println("After removals: " + list);
        System.out.println();
    }

    static void iteratingoveranLinkedList() {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.print("Using for-each loop: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nUsing while loop with iterator: ");
        var iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    static void usingLinkedListaaQueue() {
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("Task1");
        queue.offer("Task2");
        queue.offer("Task3");

        System.out.println("Queue before polling: " + queue);
        System.out.println("Processing: " + queue.poll());
        System.out.println("Queue after polling: " + queue);
        System.out.println();
    }

    static void usingLinkedListasaStack() {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println("Stack before pop: " + stack);
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println();
    }

    static void sortingaLinkedList() {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(30);

        System.out.println("Before sorting: " + numbers);
        numbers.sort(null);
        System.out.println("After sorting: " + numbers);
        System.out.println();
        System.out.println();
    }


}

class VectorScenarios{
    static void basicVectorOperations() {
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Vector: " + fruits);

        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);

        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        System.out.println();
    }

    static void accessingElements() {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("First Element: " + numbers.firstElement());
        System.out.println("Last Element: " + numbers.lastElement());
        System.out.println("Element at index 1: " + numbers.get(1));
        System.out.println();
    }

    static void sortingVector() {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);

        System.out.println("Before Sorting: " + numbers);
        Collections.sort(numbers);
        System.out.println("After Sorting: " + numbers);
        System.out.println();
    }

    static void checkElementExistence() {
        Vector<String> cities = new Vector<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");

        System.out.println("Does Vector contain 'London'? " + cities.contains("London"));
        System.out.println("Does Vector contain 'Paris'? " + cities.contains("Paris"));
        System.out.println();
    }

    static void vectorAsStack() {
        Vector<Integer> stack = new Vector<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);

        System.out.println("Original Vector (Stack): " + stack);
        System.out.println("Popped Element: " + stack.remove(stack.size() - 1));
        System.out.println("After Pop: " + stack);
        System.out.println();
        System.out.println();
    }
}

class StackScenarios {
    static void stackUsingStackClass() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack (Stack Class): " + stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
    }

    static void stackUsingArrayDeque() {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println("\nStack (ArrayDeque): " + stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
    }

    static void stackUsingLinkedList() {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(5);
        stack.push(15);
        stack.push(25);
        System.out.println("\nStack (LinkedList): " + stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
    }

    static void stackUsingCustomArrayStack() {
        CustomStack customStack = new CustomStack(5);
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);
        System.out.println("\nCustom Stack (Array-based): " + customStack);
        System.out.println("Popped: " + customStack.pop());
        System.out.println("Top element: " + customStack.peek());
    }

}
 class CustomStack {
    int[] arr;
    int top;
    int capacity;

    CustomStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        return (top == -1) ? -1 : arr[top];
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(arr, 0, top + 1));
    }
}