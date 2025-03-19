public class ReverseNumbers {
    public static void main(String[] args) {
        int a = 50;
        int reversed = 0;
        while (a>0){
            int b = a%10;
            reversed = reversed*10+b;
            a = a/10;
        }
        System.out.println(reversed);
    }
}
