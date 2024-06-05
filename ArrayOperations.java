package General_Java;

import java.util.Scanner;

public class ArrayOperations {
    static void getData(int arr[]){
        System.out.println(arr.length);

        try {
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        

    }
    public static void main(String[] args) {
        try (//int [] arr1 = {20,20,30,40,50};
        Scanner sc = new Scanner(System.in)) {
            int i,n;
            System.out.println("Enter the array elements to be inserted : ");
            n=sc.nextInt();
            int [] arr = new int[n];
            for(i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            
            System.out.println("Printing the array!");
            getData(arr);
        }
    }
}
