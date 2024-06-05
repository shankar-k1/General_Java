package General_Java;

public class Length {
    public static void main(String[] args) {


        String s1= "contest";
//        char[] ch = s1.toCharArray();
//        int mid = ch.length /2;
        System.out.println(s1.length());
        char key ='t';

//        Solution 1:
//        for(int i=mid;i>=0;i--){
//            System.out.println(ch[i]);
//        }
//        for(int i=mid+1;i<=ch.length -1 ;i++){
//            System.out.println(ch[i]);
//        }


//        Solution 2
//        int pos = s1.indexOf(key);
//        System.out.println(pos);
//
//        for(int i=pos;i>=0;i--){
//            System.out.println(ch[i]);
//        }
//        for(int i=pos+1;i<=ch.length -1; i++){
//            System.out.println(ch[i]);
//        }

//        Solution 3
        int pos = s1.indexOf(key);
        int i;
        StringBuilder b1 = new StringBuilder();

        if(pos>0){
            b1.append(s1,0,pos+1);
        }
        //reverse the string
        b1.reverse();
        //then append remaining string from pos key to last
        b1.append(s1,pos+1,s1.length());
        System.out.println(b1.toString());
    }
}
