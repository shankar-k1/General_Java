package General_Java;

public class ListFR {
    public static void main(String[] args) {
        int[][] arr ={
                {1,2,3},
                {4,5,6}
        };
        int sum =0;
        int maxsum =-1;
        for(int row =0; row< arr.length;row++){
            for(int col=0;col< arr[row].length;col++){
                sum += arr[row][col]; // sum of rows
//                sum += arr[col][row]; //sum of columns
//                for(int row =0; row< arr.length;row++){
//                    sum+=arr[row][row];
//                } //sum of diagonal elements
            }
//            System.out.println(sum);
            if(sum > maxsum){
                maxsum = sum;
            }
        }
        System.out.println(maxsum);

    }
}
