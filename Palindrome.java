package General_Java;

import java.lang.StringBuilder;
public class Palindrome {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("hello");
        
        String str="Hello";
        /*for(int i=0 ; i<str1.length(); i++){
            System.out.println(str1[i]);
        }*/
        if(str1.reverse().equals(str1)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

        char ch =(char)('a' + 1);
        System.out.println(ch);
    }
}
