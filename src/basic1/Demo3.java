package basic1;

/*判断语句：
 * if 
 * 注意事项：超过一条语句，需要使用大括号
 *        if后不能加;
 * 与三元运算符： 三元运算符简单，但是只能返回一个结果，不能执行语句。
 * 
 *        

class Demo3 {
	public static void main(String[] args)
	{
		int workAge = 2;
		if(workAge>=2){
			System.out.println("面试");
		}
	}
}
 */


/*接收键盘录入一个分数，根据分数输出相应的等级。

接受键盘录入的步骤：
 1.创建一个扫描器对象；
 2.调用扫描器对象的nextInt方法扫描数据；
 3.导入包
*/

/*
import java.util.*;
class Demo3 {
	public static void main(String[] args){
		
		System.out.println("输入一个分数");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();// num变量接受扫描内容
		System.out.println("录入的分数： "+ num);
		
		if (num>90){}
		else if (num<60){}
		else {}
	}
}

*/

import java.util.Scanner;

/*switch：
  1.default 如果放在所有case之前，  执行完case之后不执行default 。
         而且没有case符合的情况下，将从default开始全部输出。
  
  2.switch 在Java 5以前，switch(expr)中，expr只能是byte、short、char、int。
     从Java 5开始，Java中引入了枚举类型，expr也可以是enum类型，
     从Java 7开始，expr还可以是字符串（String），
     但是长整型（long）在目前所有的版本中都是不可以的。
   
  3.switch 和 if 选择：
      同等条件下选择switch效率高；
      区间，且结果为布尔类型，使用if，具体数字使用switch。
      实际开发中，具体数值，且不多，选switch，查找速度快。但是局限较大。
      
  4.case 后面必须是一个常量；
         停止条件： break 或 switch语句的大括号
 */

public class Demo3 {
	public static void main(String[] args)
	{
		System.out.println("输入月份");
		Scanner scanner = new Scanner(System.in);
		int mouth = scanner.nextInt();
		switch(mouth){
		    case 3:
		    	System.out.println("春天");
		    	break;
		    case 6:
		    	System.out.println("夏天");
		    	break;
		    case 9:
		    	System.out.println("秋天");
		    	break;
		    case 12:
		    	System.out.println("冬天");
		    	break;
		}
		
	}
}





