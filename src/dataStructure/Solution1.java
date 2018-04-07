package dataStructure;

import java.util.ArrayList;


//输出前k个最小的
public class Solution1 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	
    	
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();
 
        if(k>input.length) return  list;
        
        	int i;
        	for(i  = 0 ;i<k;i++){   
        		for(int j  = i+1 ;j<input.length;j++){  
        			if(input[j]<input[i]){
        				int temp = input[i];
        				input[i] =  input [j];
        				input[j] = temp;
        			}
        		}list.add(input[i]);
        	}
        

		return  list;
        
    }
    public static void main(String[] args){
    	
    	Solution1 s = new Solution1();
    	int[] input = {1,2,3,5,3,9};
    	int k = 3;
    	System.out.println(s.GetLeastNumbers_Solution(input, k));
    }
}