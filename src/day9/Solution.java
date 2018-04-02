package day9;

import java.util.ArrayList;



public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	
    	
    	
    	ArrayList<Integer> list = new ArrayList();
 
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
    	
    	Solution s = new Solution();
    	int[] input = {1,2,3,5,3,9};
    	int k = 9;
    	System.out.println(s.GetLeastNumbers_Solution(input, k));
    }
}