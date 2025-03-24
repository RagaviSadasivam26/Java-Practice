public class Interface {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.start();
        c.stop();

    }
}

interface Vehicle{
    void start();
    void stop();
}

class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car start");
    }

    @Override
    public void stop(){
        System.out.println("Car stop");
    }
}