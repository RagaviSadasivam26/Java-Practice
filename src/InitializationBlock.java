public class InitializationBlock {

    public static void main(String[] args) {
        A obj=new A();
        obj.r();

        A.z();
    }

}

class A {
    String a="rag";

    {
        System.out.println("in the instance block of A");
    }

    public void r(){
        int b=10;
        System.out.println("in the instance block of R");
    }

    public static void z(){
        System.out.println("in the instance block of Z");
    }
}