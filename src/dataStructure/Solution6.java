package dataStructure;

import java.util.Scanner;

//一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

/*斐波那契数，n从1开始；
 *      f(n)= 1               n=1;
 *            2               n=2;
 f(n-1)+f(n-2)   n>2;
 */
/*public class Solution {
 public int JumpFloor(int target) {

 if(target<1){return -1;}
 if(target==1){return 1;}
 if(target==2){return 2;}

 int s1 =1;
 int s2 =2;
 int s =0;
 for(int i=2;i<target;i++){
 s = s1 + s2;
 s1 = s2;
 s2 = s;
 }
 return s;
 }
 public static void main(String[] args) {
 Solution s = new Solution();
 System.out.println(s.JumpFloor(4));
 }
 }
 */

public class Solution6 {
	public int JumpFloor(int target) {
		if (target < 1)
			return -1;
		else if (target == 1)
			return 1;
		else if (target == 2)
			return 2;
		else {
			return JumpFloor(target - 1) + JumpFloor(target - 2);
		}

	}

public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.println("请输入台阶数");
		while (scanner.hasNext()) {
			int target = scanner.nextInt();
			Solution6 s = new Solution6();
			System.out.println(s.JumpFloor(target));
		}
	}

}
