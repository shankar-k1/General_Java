package General_Java;

public class StringCon {
    public static void main(String[] args) {
        String[] str1= {"ab","c"};
        String[] str2= {"a","bc"};
        String word1 ="";
        String word2 ="";


        for(int i=0;i<str1.length;i++){
            word1 +=str1[i];
        }
        for(int i=0;i<str2.length;i++){
            word2 +=str2[i];
        }
        System.out.println(word1);
        System.out.println(word2);
        if(word1.equals(word2)){
            System.out.println("yes matching");
        }
        else{
            System.out.println("Not matching");
        }
    }
}
