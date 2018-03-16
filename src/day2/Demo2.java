package day2;

import java.util.Arrays;

/*排序算法：
 * 
 选择排序（直接排序）：使用一个元素，与其他元素挨个比较一次，符合条件交换位置；

public class Demo2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 32, 31, 23, 13 };
		getMax(arr);
	}

	public static void getMax(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) // 控制轮数；
		{
			for (int j = i + 1; j < arr.length; j++) // 找出最大值
			{
				if (arr[i] > arr[j]) {//交换位置
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + ",");
		}
	}

}


冒泡排序：使用相邻的两个元素挨个比较一次，符合条件交换位置。

二分查找：定义三个变量分别记录要查找元素的范围最大索引值、中间索引值、最小索引值。
       每次都是使用中间索引值的元素与目标元素比较一次，如果不是我们需要的元素，则缩小查找范围。


class Demo2{
	public static void main(String[] args){
		int[] arr= {1,2,3,4,6,8};
		int x=halfSearch(arr,6);
		System.out.println(x);
	}
	public static int halfSearch(int[] arr,int target){
		int max = arr.length-1;
		int min = 0;
		int mid = (min+max)/2;
		//定义三个量分别记录最大、最小、中间的查找范围索引值
        while(true){
			if (target<arr[mid]){
				max= mid-1;
				}
			else if (target>arr[mid]){
				min= mid+1;
				}
			else 
				return mid;//找到了
		    if(max<min){
			    return -1;//没有找到
		}
		    mid = (min+max)/2;//重新计算中间索引值
        }
	}
	
}

数组的工具类 Arrays：
 1、排序  Arrays.sort();
 2.二分查找 Arrays.binarySearch();
 

二位数组：数组中的数组；
      定义格式：数据类型[][] 变量名= new 数据类型[长度1][长度2];
       
     动态初始化：
        数据类型[][] 变量名 = new 数据类型[长度]；
    静态初始化：
        数据类型[][] 变量名 = {{元素1， 元素2...},{元素1， 元素2...},....}； 
*/

/*数组特点：
     1.数组只能存储同一种数据类型的数据；
     2.数组是会给存储到数组中元素分配一个索引值，索引值从0开始，到length-1；
     3.数组一旦初始化，长度固定；
      
      int[] arr = new int[3];
      arr = new int[4];这个不是长度改变了，而是又新建了一个数组对象，这时在内存中指向的对象改变了；
      
     4.数组中元素与元素之间的内存地址是连续的
 */

/*题目：目前存在数组：int[] arr = {0,2,3,5,0,6}，编写一个函数接受该数组，
然后把数组的0清空，然后返回一个不存在0元素的数组；
步骤：1、计算新数组的长度；
    2、创建一个新数组；
    3、非0数组存储到新数组中；
*/

class Demo2{
	public static void main(String[] args){
		int[] a={0,2,3,5,0,6};
		a = clean(a);
		System.out.println("答案是"+ Arrays.toString(a));
		
	}
	public static int[] clean(int[] arr){//应该先求出新数组的容量
		int count = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				count++;
			}
		}
		int[] newArr = new int[arr.length-count];
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				newArr[j]=arr[i];
				j++;
			}
		}
		return newArr;
		
	}
}
