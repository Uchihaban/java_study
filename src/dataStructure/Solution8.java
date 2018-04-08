package dataStructure;

import java.util.Scanner;

public class Solution8 {
    /*public int JumpFloorII(int target) {
    	if(target<=0) return 0;
    	else if(target==1) return 1;
    	else{
    		return  2 * JumpFloorII(target - 1);
    	}
    }*/
	
	public int JumpFloorII(int target) {
	 //通过移位计算2的次方
    return 1<<(target-1);  
	}
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Solution8 sol = new Solution8();
		System.out.println("输入target：");
		while(scanner.hasNext()){
			int n = scanner.nextInt();
			System.out.println(sol.JumpFloorII(n));
		}
	}

	
}