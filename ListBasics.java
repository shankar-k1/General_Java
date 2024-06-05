package General_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListBasics {
    public static void main(String[] args) throws Exception{
        
        List<Integer> list1 =  new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();

            for(int i=0;i<n;i++){
                list1.add(sc.nextInt());
            }
        }
        for(int n1:list1){
            System.out.print(n1+" ");
        }
        Collections.sort(list1);
        System.out.println(list1);

    }
}
