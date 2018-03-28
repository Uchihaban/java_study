package day7;

import java.util.Arrays;
/*题目：数组中重复的数字
 在一个长度为n的数组里的所有数字都在0到n-1的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的。
也不知道每个数字重复几次。请找出数组中任意一个重复的数字。例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，
那么对应的输出是第一个重复的数字2。*/

public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
/*
 * 思路：最先想的是可以排序，然后再判断number[i] 和number[i+1]就可以了，代码也通过了，但是后来仔细想想，
 * 排序的方法不能保证题目条件：如果输入长度为7的数组{2,3,1,0,2,1,3}，那么对应的输出是第一个重复的数字2。
 * 排序完输出的是1
 * 
 * 
 * 	public boolean duplicate(int numbers[],int length,int [] duplication) {
 
	    if(numbers == null || numbers.length == 0) return false;
	        Arrays.sort(numbers);//排序
	        int flag = 0;//做标记
	        for(int i=0;i<length-1;i++) {
	            if(numbers[i] == numbers[i+1]) {
	                duplication[0] = numbers[i];
	                flag = 1;
	                break;//跳出
	            }
	        }
	        return flag == 1? true:false;
	}
*/
//所以又重新写了一种办法，直接用两个break，方法比较直接暴力，希望多多包涵；

	public boolean duplicate(int numbers[],int length,int [] duplication) {
	        if(numbers == null || numbers.length == 0) return false;
	        int flag=0;
	        for(int i = 0;i<length;i++){
	            for(int j = i+1;j<length;j++){
	                if(numbers[i]==numbers[j]){
	                    duplication[0]=numbers[i];
	                    flag=1;
	                    break;
	                }
	           }if(flag==1){
	               break;
	           }
	        }
	        return flag==1;
	    }
	
	public static void main(String[] args){
		Solution s = new Solution();
		int[] numbers={2,3,2,1,1};
		int [] duplication=new int[1];
		int len=numbers.length;
		System.out.println(s.duplicate(numbers,len, duplication));
		System.out.println(duplication[0]);
}
}