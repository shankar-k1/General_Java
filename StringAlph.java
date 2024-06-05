package General_Java;

public class StringAlph {
    public static void main(String[] args) {


//        char c ;
//
//        for(int i=96; i<=122;i++){
//            System.out.print((char)i + " ");
//        }

        int necount =0, eqcount =0;
        int vowel_count=0;
        String s1 ="acef";

        char[] ch = s1.toLowerCase().toCharArray();

        for(int i=1;i<ch.length-1;i++){
            if(s1.charAt(i) - s1.charAt(i+1) != 1){
                necount++;
            }
            if(s1.charAt(i) - s1.charAt(i+1) ==0){
                eqcount++;
            }
            if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u' ){

                vowel_count++;
            }
        }
        System.out.println(necount + " " + eqcount + " " + vowel_count);
    }
}
