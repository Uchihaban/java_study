package basic6;
/*
 * 包
 * 在编译的时候则可以指定类文件存放的文件夹了。
	javac -d . PackageDemo1.java    -d 后面跟着就是包名，指定包存放的路径。

 * 
 * 修饰符：
  1.	public 一个类中，同一包中，子类中，不同包中 
  2.	protected  一个类中，同一包中，子类中
  3.	default 一个类中，同一包中
  4.	private 一个类中

 * 
 * jar就是打包文件
 * 
 * jar命令
	1：jar工具存放于jdk的bin目录中(jar.exe)
	2：jar工具：主要用于对class文件进行打包(压缩)
	3：dos中输入jar查看帮助

   jar cvf test.jar cn 
       将day10中的cn文件打包为名字为test.jar文件(cn 文件是使用javac -d 编译带包的class文件夹)
 * 
 * 
 */
