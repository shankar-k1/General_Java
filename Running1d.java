package General_Java;

public class Running1d {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            arr[i]=sum;
            System.out.println(sum);
        }
    }
}
