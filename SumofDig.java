package General_Java;

public class SumofDig {
    static int sumofDigits(int N) {

        int M,sum=0;
        while(N>0){
            M= N%10;
            sum+=M; 
            N=N/10;
        }
        return 1;
    }
    public static void main(String[] args){
        
        sumofDigits(564);
    }
}

 
