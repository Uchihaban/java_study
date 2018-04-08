package basic1;
/*
//使用异或对文件加密
import java.io.*;

class Demo1
{

	public static void main(String[] args) throws Exception
	{
		 //找到文件位置
		 File inFile = new File("f:\\1.jpg");
		 File outFile = new File("f:\\jiami.jpg");
		 
		 //建立数据通道，让图片的二进制数据流入
		 FileInputStream input = new FileInputStream(inFile);
		 FileOutputStream output = new FileOutputStream(outFile);
	
		 //边读边写，把读到的数据异或到一个数据，把数据写出
		 int content = 0;// 用于存储读到的数据
		 while((content = input.read()) != -1){//到文件末尾，读入的数据存储到content
			 output.write(content^12);
		 
	     
		 }
		 //关闭资源
		 output.close();
		 input.close();
			 

	}
}


位置云算法可能出现的笔试题目：
1.交换两个变量的值，不准出现第三方变量；

class Demo1{
   public static void main(String[] args){
    int a = 2;
    int b = 5;
    
    //方式1：相加法   缺点：两个int类型数据相加，可能出现超过int的表示范围
    a = a+b;
    b = a-b;
    a = a-b;
    
    //方式2：异或   缺点：逻辑不清晰
     a = a^b; // a = 2^5
     b = a^b; // b = (2^5)^5 = 2
     a = a^b; // a = (5^2)^2 = 5
     
    System.out.println("a = " + a + " b = " + b);

   }
}


2.取出一个二进制数据的指定位数；要求读取二进制数据的低4位
00000000-00000000-00001100-01001101
& 00000000-00000000-00000000-00001111
----------------------------------------
00000000-00000000-00000000-00001101
*/