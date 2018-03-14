package day1;
/*函数：提高代码的复用性；
  定义格式：
       修饰符   返回值类型    函数名（形参列表）
       {需要被封装的功能代码；}
    函数的特点：函数的作用就是把一个功能代码封装起来，已达到提高代码的复用性；
                       定义好，需要被调用才执行；
          main函数是jvm调用，不手动调用；
                      没有返回值，则返回值类型必须是void
          
 
               
 public class Demo5 {
	public static void main(String[] args){
		int sum = add();//定义一个变量去接受；
		System.out.print("a+b=" + sum);
	}
     
	public static int add(){
		int a = 2;
		int b = 3;
		return a+b;
		
	}
}

修饰符 public static 
   
返回值类型 int 函数运行完毕返回结果的类型
 注意：某些函数是没有结果返回给调用者的，这个时候返回类型为void
  
函数名 add 需要符合标识符命名规则，首单词小写，其他单词首字母大写    作用：调用    
    
return 把结果返回到调用者
  


形参：一个函数在运行时，存在的数据要 调用者 确定，这个时候就定义形式参数；
public class Demo5 {
	public static void main(String[] args){
		int sum = add(2,4);//定义一个变量去接受；
		System.out.print("a+b=" + sum);
	}
     
	public static int add(int a, int b){
		return a+b;
		
	}
}


  
 如何定义一个函数：1.返回值类型
             2.是否存在未知的参数（是否存在调用者确定的参数）
       
    
 

*/