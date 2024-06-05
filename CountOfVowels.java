package General_Java;

public class CountOfVowels {
    public static void main(String[] args) {
        String str = "textbook";
        char[] ch = str.toLowerCase().toCharArray();
        //split the string into 2 halves as we know already the outcome is even
        int twopart = str.length() / 2;

        int i;

        for(i=0;i<twopart;i++){
            System.out.print(ch[i]);
        }
        System.out.println("\n");
        for(i=twopart;i<=ch.length -1;i++){
            System.out.print(ch[i]);
        }
        int count1 =0;
        for(i=0;i<twopart;i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
                count1++;
            }
        }
        System.out.println(count1);
        int count2=0;
        for(i=twopart;i<=ch.length -1;i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
                count2++;
            }
        }
        System.out.println(count2);

        if(count1 ==count2){
            System.out.println("true");
        }
        else {
            System.out.println("true");
        }
    }
}
