package day6;
/*
 * 异常：程序不正常的情况，java是面向对象的语言。sun使用了很多类描述java程序中各种不正常的情况，异常类。
 *     异常类堆积形成java异常体系；
 * 
 *Throwable 所有异常和错误的超类（父类）
 *---Error(错误)：一般用于jvm或是硬件引发的问题，所以我们一般不会通过代码去处理错误         
 *---Exception(异常）：需要代码去处理
 *------运行时异常：如果一个方法内部跑出了一个运行时异常，那么方法上可以声明也可以不声明，调用者可以处理也可以不处理；              
 *------编译时异常（非运行时异常、受检异常）：如果一个方法内部跑出了一个编译时异常，那么方法上必须声明，调用者必须处理；
 *
 *运行时异常：RuntimeException 以及它的子类
 *编译时异常：除了运行时异常 
 *                
 * 如何区分错误与异常：
 *    如果程序出现了不正常的信息，该信息的类名是以Error结尾的，那么肯定是一个错误；
 *    如果是以Exception结尾的，那么肯定就是一个异常；
 *    
 * Throwable ：
 *   toString(); 返回当前异常对象的完整类名+病态信息；例如java。lang.Throwable
 *   getMessage();返回的是创建的Throwable传入的字符串信息
 *   printStackTrace();打印异常的栈信息；
 *   
 *   
 * 异常的处理：
 * 1.捕获异常；
 *      try{可能发生异常的代码}
 *      catch（捕获的异常类型  变量名）{
 *          处理异常的代码...
 *          }
 *          
 *      注意事项：1.try块中代码出了异常经过了处理以后，那么try-catch块外面的代码可以正常执行；
 *             2.try块中出了异常的代码，那么try块中出现异常代码后面的代码是不会执行的；
 *             3.一个try块后面是可以跟有多个catch块的，也就是一个try块可以捕获多种异常的类型；
 *             4.一个try块可以捕获多种异常的类型；但是不活的异常类型必须从小到大进行捕获，否则编译报错；
 *             
 *      分开处理异常；
 *      
 * 2.抛出异常；
 *      throw throws 
 *      
 *      注意事项：1.如果一个方法内部抛出了一个编译时异常，那么必须要在方法上声明抛出；
 *             2.如果调用了一个声明抛出编译时异常的方法，那么调用者必须要处理（捕获或者继续抛出）；
 *             3.如果一个方法内部抛出了一个异常，那么输入语句后面的代码都不会再实行了；
 *             4.一种情况下，只能抛出一种类型异常对象；
 *             
 *      throw throws
 *      throw是方法内部的，throws是用于方法声明上的；
 *      throw用于方法内部抛出一个异常对象的，throws是用于方法声明上声明抛出异常的；
 *      throw后面只能有一个异常对象，throws后面一次可以声明抛出多种类型的异常；
 *      
 *      抛出异常使用场景：需要 通知到调用者，代码出现问题，则抛出异常；
 *      捕获异常             ：代码直接跟用户打交道时，就不要再抛，这时候使用捕获；
 *      
 *      
 *      
 *一定要使用的文件   使用    finally 块
 *    使用前提是必须存在try块。
 *    
 *    出不出异常，finally块都会执行，只有jvm退出的时候不能执行；
 *    适合做资源释放的工作，这样可以保证资源文件在任何情况下都能被释放；
 *  
 *    
 * try块三种组合方式：
 * 1.有异常要处理，没有资源要释放
 *   try{可能发生异常的代码}
 *      catch（捕获的异常类型  变量名）{
 *          处理异常的代码...
 *          }
 *          
 * 2.有异常要处理，有资源要释放
 *   try{可能发生异常的代码}
 *      catch（捕获的异常类型  变量名）{
 *          处理异常的代码...}
 *      finally{释放资源的代码}
 * 3.内部抛出运行时异常，并且有资源要释放
 *   try{可能发生异常的代码}
 *      finally{释放资源的代码}
 */


public class Demo1 {
	public static void main(String[] args){
		//捕获异常
				try{
					int[] arr = null;
					//调用声明抛出异常类型的方法
					div(4,0,arr); 
				}catch(Exception e){
					System.out.println("出现异常");
					e.printStackTrace();
				}finally {
					System.out.println("释放资源");
				}
		
	// 把异常抛给jvm
		//public static void main(String[] args) throws Exception{
		//div(4,0,arr);}
		
	}
	public static void div(int a,int b,int[] arr) throws Exception,NullPointerException{//声明抛出；
		if(b==0){
			throw new Exception();//抛出一个异常
		}else if(arr==null){
			throw new NullPointerException();
		}//4.一种情况下，只能抛出一种类型异常对象；
		int c=a/b;
		System.out.println(c);
	}
}
