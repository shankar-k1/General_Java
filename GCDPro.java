package General_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GCDPro {
    public static void main(String[] args) {
        String[] s1 = {"leet","code"};
        char c = 'e';

        for(int i=0;i<s1.length;i++){
            for(int j=0;j<s1[i].length();i++){
                if(s1[i].charAt(j)==c){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
