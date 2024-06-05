package General_Java;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("UnreachableCode")
public class ArrayPat {
    public static void main(String[] args) {

        int[] arr ={1,2,5,6,3,4};
        int splitsize = arr.length /2, temp=0, temp1=0;
        if(arr.length % 2 ==0) {

            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            for(int i =0;i<splitsize;i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j])
                        temp++;
                }
                    list1.add(arr[i]);
            }
            for(int i=splitsize;i<arr.length;i++){
                for (int j = splitsize + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j])
                        temp1++;
                }
                list2.add(arr[i]);
            }
            if(temp>0){
                System.out.println("not formed");
            }
            else{
                System.out.println(list1);
                System.out.println(list2);
            }
        }
        else {
            System.out.println("not formed");
        }
    }
}
