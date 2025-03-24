public class MethodOverloading {
    public static void main(String[] args) {
        MathAggregate math = new MathAggregate();

        System.out.println("Sum of 5 and 10: " + math.add(5, 10));
        System.out.println("Sum of 5.5 and 10.5: " + math.add(5.5, 10.5));
        System.out.println("Sum of 3, 7, and 12: " + math.add(3, 7, 12));

    }
}

class MathAggregate {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}