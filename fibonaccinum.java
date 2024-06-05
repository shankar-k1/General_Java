package General_Java;

import java.util.Scanner;

public class fibonaccinum {
    public static void main(String[] args) {
        int n1=0,n2=1;
        int n3=n1+n2;
        

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n4=sc.nextInt();
        System.out.println(n1 + "\n" + n2);
        for(int i=2;i<=n4;++i){
            n1=n2;
            n2=n3;
            n3=n1+n2;
        }
        System.out.println(n3);
    }
}
