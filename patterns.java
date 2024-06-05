package General_Java;

import java.util.Scanner;

public class patterns {
    static void pattern1(int n){
        int i,j;

        for( i = 1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    
    static void pattern2(int n){
        int i,j;
        for(i =1 ;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(i =n-1 ;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern3(int n){
        
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines to be printed : ");
        n=sc.nextInt();

        System.out.println("Printing the pattern : ");
        pattern2(n);
        sc.close();
    }
}
