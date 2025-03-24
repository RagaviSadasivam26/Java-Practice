import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;


public class QueueonCollectionsExamples {
    public static void main(String[] args) throws InterruptedException {
        PriorityQueueScenarios.basicPriorityQueue();
        PriorityQueueScenarios.maxHeapPriorityQueue();
        PriorityQueueScenarios.stringPriorityQueue();
        PriorityQueueScenarios.objectPriorityQueue();
        PriorityQueueScenarios.stringLengthPriorityQueue();

        LikedListQueueScenarios.basicLikedListQueue();
        LikedListQueueScenarios.inbuiltmethodsinLinkedListQueue();
        LikedListQueueScenarios.removingElementsFromLinkedListQueue();
        LikedListQueueScenarios.iterationoverLinkedListQueue();
        LikedListQueueScenarios.checkingElementsFromLinkedListQueue();

        ArrayDequeueScenarios.basicArrayDequeue();
        ArrayDequeueScenarios.arrayDequeueusingSTack();
        ArrayDequeueScenarios.checkingElementsFromArrayDeque();
        ArrayDequeueScenarios.addingandRemovingElementsFromArrayDeque();
        ArrayDequeueScenarios.checkingElementsFromArrayDeque();

        PriorityBlockingQueueScenarios.basicUsage();
        PriorityBlockingQueueScenarios.usingCustomComparator();
        PriorityBlockingQueueScenarios.pollingElements();
        PriorityBlockingQueueScenarios.producerConsumerExample();
        PriorityBlockingQueueScenarios.usingCustomObjects();

        ConcurrentLinkedQueueScenarios.basicOperations();
        ConcurrentLinkedQueueScenarios.iteratingQueue();
        ConcurrentLinkedQueueScenarios.pollingAndPeeking();
        ConcurrentLinkedQueueScenarios.concurrentAccess();
        ConcurrentLinkedQueueScenarios.removeElementsBasedOnCondition();

        LinkedBlockingQueueScenarios.basicOperations();
        LinkedBlockingQueueScenarios.producerConsumerExample();
        LinkedBlockingQueueScenarios.blockingBehavior();
        LinkedBlockingQueueScenarios.iterateQueue();
        LinkedBlockingQueueScenarios.removeElementsConditionally();


    }
}

class PriorityQueueScenarios {

    public static void basicPriorityQueue() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println("\n");
    }

    public static void maxHeapPriorityQueue() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println("\n");
    }

    public static void stringPriorityQueue() {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Banana");
        pq.add("Apple");
        pq.add("Mango");
        pq.add("Cherry");

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println("\n");
    }


    public static void objectPriorityQueue() {
        PriorityQueue<Person> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.age));
        pq.add(new Person("Alice", 25));
        pq.add(new Person("Bob", 30));
        pq.add(new Person("Charlie", 20));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        System.out.println();
    }

    public static void stringLengthPriorityQueue() {
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparingInt(String::length));
        pq.add("Java");
        pq.add("Python");
        pq.add("C");
        pq.add("JavaScript");

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println("\n");
    }

}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }
}

class LikedListQueueScenarios {

    public static void basicLikedListQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        System.out.println("Queue: " + queue);
        System.out.println("Removed: " + queue.remove());
        System.out.println("Queue after remove: " + queue);
        System.out.println();
    }

    public static void inbuiltmethodsinLinkedListQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("\nQueue: " + queue);
        System.out.println("Peek (Front Element): " + queue.peek());
        System.out.println("Poll (Removed): " + queue.poll());
        System.out.println("Queue after poll: " + queue);
        System.out.println();
    }

    public static void iterationoverLinkedListQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("Java");
        queue.add("Python");
        queue.add("C++");

        System.out.println("\nIterating over Queue:");
        for (String lang : queue) {
            System.out.println(lang);
            System.out.println();
        }
    }

    public static void removingElementsFromLinkedListQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(15);
        queue.add(25);
        queue.add(35);

        System.out.println("\nQueue before removal: " + queue);
        queue.remove(15);
        System.out.println("Queue after removing 15: " + queue);
        System.out.println();
    }

    public static void checkingElementsFromLinkedListQueue() {
        Queue<String> queue = new LinkedList<>();

        System.out.println("\nIs queue empty? " + queue.isEmpty());

        queue.add("Item 1");
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println();
        System.out.println();
    }

}

class ArrayDequeueScenarios {
    public static void basicArrayDequeue() {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue (FIFO): " + queue);
        System.out.println("Removed (poll): " + queue.poll());
        System.out.println("After poll: " + queue);
        System.out.println();
    }

    public static void arrayDequeueusingSTack() {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("\nStack (LIFO): " + stack);
        System.out.println("Popped (pop): " + stack.pop());
        System.out.println("After pop: " + stack);
        System.out.println();
    }

    public static void addingandRemovingElementsFromArrayDeque() {
        Deque<Character> deque = new ArrayDeque<>();
        deque.addFirst('X');
        deque.addLast('Y');
        deque.addFirst('Z');
        System.out.println("\nDeque: " + deque);
        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());
        System.out.println("After removals: " + deque);
        System.out.println();
    }

    public static void checkingElementsFromArrayDeque() {
        Deque<String> names = new ArrayDeque<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("\nNames: " + names);
        System.out.println("First: " + names.getFirst());
        System.out.println("Last: " + names.getLast());
        System.out.println();
    }

    public static void ArrayDequeueUsingOfferandPeek() {
        Deque<Integer> numbers = new ArrayDeque<>();
        numbers.offer(100);
        numbers.offer(200);
        numbers.offer(300);
        System.out.println("\nNumbers (Using offer): " + numbers);
        System.out.println("Peek (Front element): " + numbers.peek());
        System.out.println("After peek: " + numbers);
        System.out.println();
        System.out.println();
    }
}

class PriorityBlockingQueueScenarios {

    public static void basicUsage() {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        queue.add(30);
        queue.add(10);
        queue.add(20);

        System.out.println("Sample 1: Basic Integer PriorityBlockingQueue");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println();
    }


    public static void usingCustomComparator() {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>(10, Comparator.reverseOrder());
        queue.add(10);
        queue.add(5);
        queue.add(20);
        queue.add(15);


        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println();
    }

    public static void producerConsumerExample() {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                queue.add(i * 10);
                System.out.println("Produced: " + (i * 10));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                Thread.sleep(1000);
                while (!queue.isEmpty()) {
                    System.out.println("Consumed: " + queue.take());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    public static void pollingElements() {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        queue.add(30);
        queue.add(10);
        queue.add(40);
        queue.add(20);

        System.out.println("\nPolling Elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println();
    }

    public static void usingCustomObjects() {
        class Task {
            String name;
            int priority;

            public Task(String name, int priority) {
                this.name = name;
                this.priority = priority;
            }

            @Override
            public String toString() {
                return "Task{name='" + name + "', priority=" + priority + "}";
            }
        }

        PriorityBlockingQueue<Task> taskQueue = new PriorityBlockingQueue<>(10, Comparator.comparingInt(t -> t.priority));

        taskQueue.add(new Task("Low Priority", 3));
        taskQueue.add(new Task("High Priority", 1));
        taskQueue.add(new Task("Medium Priority", 2));

        System.out.println("\nUsing Custom Objects:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
        System.out.println();
        System.out.println();
    }
}

class ConcurrentLinkedQueueScenarios {

    public static void basicOperations() {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("Queue after adding elements: " + queue);

        queue.remove("Banana");
        System.out.println("Queue after removing 'Banana': " + queue);
        System.out.println();
    }

    public static void iteratingQueue() {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Iterating through the queue:");
        for (Integer num : queue) {
            System.out.println(num);
        }
        System.out.println();
    }

    public static void pollingAndPeeking() {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        System.out.println("Peek at head element: " + queue.peek());
        System.out.println("Polling (removes head element): " + queue.poll());
        System.out.println("Queue after polling: " + queue);
        System.out.println();
    }

    public static void concurrentAccess() {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                queue.add(i);
                System.out.println("Added: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                Thread.sleep(200);
                while (!queue.isEmpty()) {
                    System.out.println("Removed: " + queue.poll());
                    Thread.sleep(150);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
    }

    public static void removeElementsBasedOnCondition() {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Queue before removal: " + queue);

        queue.removeIf(num -> num > 25);

        System.out.println("Queue after removing elements > 25: " + queue);
        System.out.println();
        System.out.println();
    }
}

class LinkedBlockingQueueScenarios {
    public static void basicOperations() {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>(3);
        try {
            queue.put("One");
            queue.put("Two");
            queue.put("Three");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Queue: " + queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
        System.out.println();
    }

    public static void producerConsumerExample() {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    Integer value = queue.take();
                    System.out.println("Consumed: " + value);
                    Thread.sleep(700);
                    if (value == 5) break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    public static void blockingBehavior() throws InterruptedException {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(2);
        queue.put(10);
        queue.put(20);

        System.out.println("Queue is full. Trying to insert another element...");
        new Thread(() -> {
            try {
                queue.put(30);
                System.out.println("Inserted 30 after space was available");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        Thread.sleep(2000);
        System.out.println("Removing element: " + queue.take());
        System.out.println();
    }

    public static void iterateQueue() {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("Iterating over queue:");
        for (String fruit : queue) {
            System.out.println(fruit);
        }
        System.out.println();
    }

    public static void removeElementsConditionally() {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Queue before removal: " + queue);
        queue.removeIf(n -> n % 20 == 0);
        System.out.println("Queue after removing multiples of 20: " + queue);
        System.out.println();
    }

}