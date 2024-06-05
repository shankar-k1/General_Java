package General_Java;

public class StrReverse {
    public static void main(String[] args) {
        StringBuilder b1 = new StringBuilder();
        String str1="contest";
        char key ='t';
int i;

        char[] ch = str1.toCharArray();

        for( i=0;i<ch.length;i++){
            if(ch[i]==key){
                for( i=str1.indexOf(key);i<=0;i--){
                    System.out.println(ch[i]);
                }
            }
        }







    }
}
