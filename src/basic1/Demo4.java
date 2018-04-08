package basic1;

import java.util.Random;
import java.util.Scanner;


/*循环语句：
  while（循环语句）{
         循环语句；
      }
 */

/*
产生一个随机数，步骤：
 1.创建一个随机对象；
 2.调用随机数对象的nextInt方法。
 3.导包。
*/
/*
public class Demo4 {
	public static void main(String[] args)
	{   
		//创建随机数
		Random random = new Random();
		int randomNum = random.nextInt(11); //0-10
		//int randomNum = random.nextInt(11)+1; 1-10
        //创建一个扫描器对象
		Scanner scanner = new Scanner(System.in);
		
		boolean flag = true;//使得猜对后就退出
		while(flag){
		System.out.println("请输入你猜的数字： ");
		int guessNum = scanner.nextInt();//nextInt扫描一个数字
		
		if(guessNum == randomNum){
			System.out.print("猜对了");
			flag = false;
		}else {
			System.out.print("猜错了");
		}
	}
	}
}

/*do-while
  do{
    }while(判断条件）；
    
    不管条件如何，都会执行一次；
  while 与 do-while 的判断语句是一样的
      
*/

/*for循环
  for（初始化语句；判断语句；循环后的语句）{
           循环语句
  }
  
  注意：for循环中两个分号最重要；for（；；）相当于while（true）死循环；
           初始化语句只是在第一次循环时执行；
  */

//打印一个九九乘法表

class Demo4{
	public static void main(String[] args){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.println(i + "*" + j + "=:" + i*j + "\n");
			}
			System.out.println();
		}
	}
}

/* 转义字符："\ "
    \b退格
    \t tab 
    \n换行 
    \r回车  把一行的光标移动到一行的首位置上
    \\ 
    
     Windows下的操作文件使用\n需要\r\n一起使用，其他系统使用\n即可
*/

/*break关键字：
  break 使用范围：switch和循环语句
                  作用：用于switch是结束switch语句，用于循环是结束当前所在的循环语句；
                  
  面试题目：break目前处于内层循环，如何让break作用于外层的for循环
  
    添加outer inner 标记 （标记的命名符合标识符就可以使用）
    outer：for（i=1；i<3;i++){
        inner:for（j=1；j<3;i++){
            System.out.println("hello");
            break outer;
      }
    }
 */

/*continue关键字:
     continue 使用范围：循环语句
                  作用：跳过循环体，继续下一次； 
                  注意事项：在一种情况下，continue 后不能跟任何语句，因为是废话；
                                  也可以配合标记使用
                                  
    outer：for（i=1；i<3;i++){
        inner:for（j=1；j<3;i++){
            System.out.println("hello");
            continue outer;
      }
    }
 */