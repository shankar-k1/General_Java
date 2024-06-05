package General_Java;

import java.util.Scanner;

public class ArraySearch {
    static void Check(int a[],int num,int search){
        for(int i=0;i<a.length;i++){
            if(search==a[i]){
                System.out.println(i);
            }
        }
    }

    static void reverse(int a[],int num){
        int[] sum=new int[num];
        for(int i=0;i<a.length;i++){
            
        }
    }
    public static void main(String[] args) {
        try (//int [] arr1 = {20,20,30,40,50};
        Scanner sc = new Scanner(System.in)) {
            int i,n,key;
            System.out.println("Enter the array elements to be inserted : ");
            n=sc.nextInt();
            key=sc.nextInt();
            int [] arr = new int[n];
            for(i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            
            System.out.println("printing the index");
            reverse(arr, n);
        }
    }
}
