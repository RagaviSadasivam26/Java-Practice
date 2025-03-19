

public class Polymorphism {
    public static void main(String[] args) {
        shape.calculateArea();
        int radius=10;
        Circle A=new Circle();
        A.calculateArea(radius);
        int length=10;
        int width=10;
        int height=10;
        Rectangle B=new Rectangle();
        B.calculateArea(length, width, height);

    }
}

class shape{
    static void calculateArea(){
        System.out.println("Calculating Area.....");
    }
}

class Circle{
    void calculateArea(int radius) {
        System.out.println("Area of Circle: " + Math.PI * radius * radius);
    }
}

class Rectangle{

    void calculateArea(int length,int width, int height) {
        System.out.println("Area of Rectangle: " + (length * width * height));
    }
}