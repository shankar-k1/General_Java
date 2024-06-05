package General_Java;

public class MoveZero {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,2};

        int start = 0;
        int end = nums.length - 1;

        //indices
        System.out.print(start + " "+ end);

        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]=temp;
            start++;
            end--;

        }


    }
}
