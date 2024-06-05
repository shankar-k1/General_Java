package General_Java;

import java.util.Scanner;

public class arraySub {

    static void Substr(int a[], int b[], int n){
        int i, recount=0,count=0;

        for(i=0;i<a.length;i++){
            if(a[i]%2!=0)
                count++;
            else
                recount++;
        }
        System.out.println(count +" "+recount);
    }
    public static void main(String[] args) {
        try (//int [] arr1 = {20,20,30,40,50};
        Scanner sc = new Scanner(System.in)) {
            int i,n;
            System.out.println("Enter the array elements to be inserted : ");
            n=sc.nextInt();
            int [] arr = new int[n];
            for(i=0;i<=arr.length;i++){
                arr[i]=sc.nextInt();
            }
            
            System.out.println("Printing!");
            Substr(arr, arr, n);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
