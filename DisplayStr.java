package General_Java;

public class DisplayStr {
    public static void main(String[] args) {

        String s1 = "aacedgff";
        int eqcount =0;
        int notequalcount =0;

        char[] ch = s1.toLowerCase().toCharArray();

        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length - 1;j++){
                if(ch[i]==ch[j]){
                    eqcount++;
                }
                else{
                    notequalcount++;
                }
            }
        }
        System.out.println(eqcount);
        System.out.println(notequalcount);
    }
}

