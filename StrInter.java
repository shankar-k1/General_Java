package General_Java;

import java.lang.StringBuilder;
public class StrInter {
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder();
        String s1 = "G()(al)";


        int i =0;

        while(i<s1.length()){
            if(s1.charAt(i) == 'G'){
                str.append("G");
                i++;
            } else if (s1.charAt(i)=='(' && s1.charAt(i+1)==')'){
                str.append("o");
                i+=2;
            }
            else{
                str.append("al");
                i+=4;
            }
        }
        System.out.println(str.toString());
    }
}
