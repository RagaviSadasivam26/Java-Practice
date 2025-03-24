public class StaticKey {
    public static void main(String[] args) {
        // Creating multiple Counter objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Total objects created: " + Counter.getCount());
    }
}

class Counter {
    // Static variable to keep track of count
    static int count = 0;

    // Constructor that increments count whenever an object is created
    Counter() {
        count++;
    }

    // Static method to return the current count value
    static int getCount() {
        return count;
    }
}
