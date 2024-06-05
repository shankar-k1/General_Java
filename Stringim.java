package General_Java;

public class Stringim {
    public static void main(String[] args) {
//        char reverse
//        String s1 ="the sky is blue";
//        char[] ch = s1.toCharArray();
//        StringBuilder out = new StringBuilder();
//        for(int i = ch.length -1;i>=0;i--){
//            out.append(ch[i]);
//        }
//        System.out.println(out);


        String[] s1 ={"the sky is blue "};


        StringBuilder out = new StringBuilder();
        for(int i=s1.length -1 ;i>=0;i--){
            out.append(s1[i]).append(" ");
        }
        System.out.println(out);


    }
}
