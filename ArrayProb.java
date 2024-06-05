package General_Java;

import java.util.Scanner;

public class ArrayProb {
    public static void main(String[] args) {
        try (//int [] arr1 = {20,20,30,40,50};
        Scanner sc = new Scanner(System.in)) {
            int upperCase = 0;
        int lowerCase = 0;
        int number = 0;
        int special=0;
            //System.out.println("Enter the array elements to be inserted : ");
            //n=sc.nextInt();
            //String [] arr = new String[n]
            String str="#GeeKs01fOr@gEEks07";
            
            char ch[]=str.toCharArray();
            String rem="";

            for(char chh : ch){
                if(chh >='A' && chh <='Z') {
                    upperCase++;
                 } else if (chh >= 'a' && chh <= 'z') {
                    lowerCase++;
                 }
                    else if(chh>= 48 && chh<=57){
                        number++;
                    }
                    else{
                        special++;
                    }
                    
            }
            System.out.println(upperCase);
            System.out.println(lowerCase);
            System.out.println(number);
            System.out.println(special);
            
        }
    }
}
