package General_Java;

import java.util.*;
class twoarraycom {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long t=sc.nextLong();
		
		while(t-->0)
		{
		  int n=sc.nextInt();
		  long arr[]=new long[n];
		  long brr[]=new long[n];
		  
		  for(int i=0;i<n;i++)
		  {
		      arr[i]=sc.nextLong();
		  }
		  
		  for(int i=0;i<n;i++)
		  {
		      brr[i]=sc.nextLong();
		  }
		  check(arr,brr,n);
		  
		}
	}

    static boolean check(long A[],long B[],int N){

        int i;

        for(i=0;i<A.length;i++){
                if(A[i]!=B[i]){
                    return false;
                }
        }
        return true;
    }
}