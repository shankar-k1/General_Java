package General_Java;

public class HappyNumber {
    public static void main(String[] args) {
        int num = 19;
        int pro =0;
        int res =0;

        while(num>0) {
            pro = num % 10;
            res += pro * pro;
            num/=10;
        }
        num =res;
        res =0;
        System.out.println(res);
    }
}
