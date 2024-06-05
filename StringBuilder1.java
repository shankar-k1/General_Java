package General_Java;

import java.lang.StringBuilder;
public class StringBuilder1 {
    public boolean StringCom(String[] str1, String[] str2){
        StringBuilder b1 = new StringBuilder();
        StringBuilder b2 = new StringBuilder();


        for(String w1 : str1){
            b1.append(w1);
        }
        for(String w2 : str1){
            b2.append(w2);
        }
        if(b1.toString() .equals(b2.toString())){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        

    }
}
