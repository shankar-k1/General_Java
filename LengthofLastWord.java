package General_Java;

public class LengthofLastWord {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("   fly me   to   the moon  ");

        System.out.println(builder.length());

        String s1= "fly me   to   the moon  ";

        char ch[] = s1.trim().toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
        System.out.println("\n");
        int count =0;
        for (int i = ch.length - 1; i >= 0; i--) {
            if(ch[i]==' '){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
    }
