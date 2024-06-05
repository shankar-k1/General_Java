package General_Java;

public class CandiesCount {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};

        int key = 3;
        int i;

        int[] temp = new int [arr.length];

        int max = temp[0];
        for(i=0;i<arr.length;i++){
            temp[i]=arr[i]+key;
            System.out.println(temp[i]);
            if(temp[i]>max){
                max=temp[i];
                System.out.println("true");
            }
        }

    }
}
