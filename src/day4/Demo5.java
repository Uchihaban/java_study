package day4;

import java.util.*;

/*
 * 值交换：调用一个方法的时候，传递给方法的变量实参，实际上传递变量所存储的值。
 * 
 * 
 * 需求一：定义一个函数交换两个基本类型变量的值
 * 形参是所属函数的局部变量；
 * 不同函数的局部变量与局部变量是相互独立的，没有任何关系；
 * 
 * public class Demo5 {
	public static void main(String[] args){
		int a = 3;
		int b =2;
		changeValue(a,b);
		System.out.println("结果"+a+","+b);
		
	}
	public static void changeValue(int a,int b){
		int temp = b;
		b = a;
		a = temp;
	}
}
 * 
 * 
 * 需求二：定义一个函数交换数组中两个元素的位置
 * 两个函数arr是不同的；
 * arr这两个不同的变量只不过是操作了相同的对象，所以才导致了修改成功。
 * 
 * public class Demo5 {
	public static void main(String[] args){
		int[] arr = {2,3,4,3};
		changeValue(arr,2,3);
		System.out.println("结果"+Arrays.toString(arr));
		
	}
	public static void changeValue(int[] arr,int a,int b){
		int temp = arr[a];
		arr[b] = arr[a];
		arr[a] = temp;
	}
}
*/
