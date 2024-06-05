package General_Java;

import java.util.Scanner;

public class ArrayTesting {
    static void darray(int[][] arr){
        int i,j;    
        System.out.println("Printing the 2d array elements :");
        for(i = 0; i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sumOfrDiagonal=0;
        for(i = 0; i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                if(i==j){
                    sumOfrDiagonal+=arr[i][j];
                }
            }    
        }

        int sumOflDiagonal=0 , m=arr.length-1;
        for(i = 0; i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                if(j==m-i ){
                    sumOflDiagonal+=arr[i][j];
                }
            }    
        }
        System.out.println(sumOflDiagonal-sumOfrDiagonal);


    }

    static void darrayops(int[][] arr){
        int i,j;    
        System.out.println("Printing the 2d array elements :");
        for(i = 0; i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for(i = 0; i<arr.length;i++){
            
            for(j=0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows and columns to be inserted:");
        n=sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the 2d array elements : ");
        for(i = 0; i<n;i++){
            for(j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        darray(arr);
    }
}
