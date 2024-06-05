package General_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fizz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> list1 = new ArrayList<>(n);
        for (int i = 1; i <=n; i++) {

            if(1%3 != 0 && i %5 == 0){
                list1.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                list1.add("Fizz");
            }
            else if (i % 5 == 0) {
                list1.add("Buzz");
            }
            else{
                list1.add(String.valueOf(i));
            }
        }
        System.out.println(list1);
    }
}
