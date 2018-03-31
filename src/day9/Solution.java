package day9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Solution {
    public int[] multiply(int[] A) {
    	if(A.length==0) return A;
    	Collection arr = new ArrayList();
        int e=A[A.length-2]*A[A.length-1];
        for(int i= 0 ; i<A.length;i++){
        	
        	arr.add(e);
        	e=e*A[A.length-1];
        }
         
      
            
        int [] B=new int[arr.size()];
        for(int i = 0;i<arr.size();i++){  
            B[i] = (int) ((ArrayList) arr).get(i);  
        }
        return B;
    }
    public static void main(String[] args){
    	Solution s = new Solution();
    	int[] A = {2,3,4,5,6,7};
    	int[] B = s.multiply(A);
    	System.out.println(B.toString());
    }
  
}