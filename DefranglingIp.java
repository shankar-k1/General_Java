package General_Java;

public class DefranglingIp {
    public static void main(String[] args) {
        String str1="1.1.1.1";
        char[] ch = str1.toCharArray();
        StringBuilder b1 = new StringBuilder();

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='.'){
                b1.append("[.]");
            }
            else{
                b1.append(ch[i]);
            }
        }
        System.out.println(b1.toString());
    }
}
