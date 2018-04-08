package dataStructure;

import java.util.ArrayList;
import java.util.Scanner;


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
    	@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
    	while(scanner.hasNext()){
    		
    		int N = scanner.nextInt();
    		int[] input = new int[N];
    		for(int j = 0;j<N;j++){
                input[j]=scanner.nextInt();
            }
    	    int K = scanner.nextInt();
    	    
    	    System.out.println(s.GetLeastNumbers_Solution(input, K));
    	}
    	
    	
    	
    	
    }
}