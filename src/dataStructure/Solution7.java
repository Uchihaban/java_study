package dataStructure;

import java.util.Scanner;

//大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。n<=39
public class Solution7 {
    public int Fibonacci(int n) {
    	if(n<=0) return 0;
    	if(n==1||n==2) return 1;
    	else{
    		return Fibonacci(n-1)+Fibonacci(n-2);
    	}
    }
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Solution7 sol = new Solution7();
		System.out.println("输入n：");
		while(scanner.hasNext()){
			int n = scanner.nextInt();
			System.out.println("第"+n+"项为"+sol.Fibonacci(n));
		}
	}
}