public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5};
        int sum = 0;
        for(int i : arr){
            sum = sum^i;
        }
        System.out.println(sum);
    }
}
