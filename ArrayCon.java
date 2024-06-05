package General_Java;

public class ArrayCon {
    public static void main(String[] args) {
        int[] arr ={1,2,1};
        int n =arr.length;

        int[] ans =new int[2*n];

        for(int i=0;i<n;i++){
            ans[i]+=arr[i];
            System.out.println(ans[i]);
        }
        for(int j=0;j<n;j++){
            System.out.println(arr[j]);
        }

    }
}
