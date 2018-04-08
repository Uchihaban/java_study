package basic3;
/*共享数据：方法区（数据共享区）
 * static String country = "中国";
 * 使用static修饰country，那么这时候country就是一个共享的数据。
 * 
 * 
 * class Student{
	String name;
	static String country = "中国";
	
	public Student(String name){
		this.name = name;
	}
	public void study(){
		System.out.println(name+"好好学习");
	}
	public static void sleep(){
		System.out.println("呼呼大睡");
	}
}
public class Demo3 {
    public static void main(String[] args){
    	Student s = new Student("狗娃");
    	s.study();
    	s.sleep();
    }
}

 * 
 * 
 * 
 * 
 * static（静态/修饰符）
 * 1.修饰成员变量：如果有数据需要被共享给所有对象使用时，那么就可以使用static修饰；
 *        静态成员变量的访问方式：
 *                方式一：可以使用对象进行访问；   格式： 对象.变量名
 *                方式二：可以使用类名进行访问；   格式： 类名.变量名
 *        非静态成员变量只能使用对象进行访问，不能使用类名访问。
 *        只有成员变量是真正需要共享的时候才是用static修饰。
 * 2.修饰成员函数；
 *         static 修饰方法（静态的成员方法）
 *         
 *         访问方式：
 *             对象.静态的函数名字（）；
 *             类名.静态函数名字；
 *             
 *      1.静态函数是可以使用类名或者对象进行调用的，非静态只能使用对象进行调用。
 *      2.静态函数可以访问静态成员，不能访问非静态的成员；（成员函数和成员变量）
 *        原因：静态函数可以使用类名直接调用，这时候可能还没有存在对象。而非静态数据也随着对象的创建而存在的。
 *      3.非静态函数可以访问静态和非静态成员。
 *        原因：非静态函数只能由对象调用，当对象存在时，静态数据早就存在了，而非静态数据也随着对象的创建而存在了，直接访问就可以了。
 *      4.静态函数不能出现this或super关键字。
 *        原因：因为静态函数是可以使用类名调用的，一旦使用类名调用这时候不存在对象，
 *            而this关键字是代表了一个函数的调用者对象，这时候产生了冲突。
 *      
 * 静态数据的生命周期：静态成员数据是优先于对象存在的，静态代码块是在.class文件加载带内存的时候马上执行的。
 *      
 *  静态函数只要存在有对象，也可以访问非静态数据，只是不能直接访问而已。
 *  
 *  
 * 
 * 
 * 
 
如果一个函数没有直接访问到非静态成员，那么可以使用static修饰了。一般用于工具类型的方法。 
class ArrayTool{
	
	public static String toString(int[] arr){
		String result = "";
		for(int i=0; i<arr.length;i++){
			if(i==0){
				result+="["+arr[i]+",";
			}else if(i==arr.length-1){
				result+=arr[i]+"]";
			}else{
				result+=arr[i]+",";
			}
	}
		return result;
}
		public static void sort(int[] arr){
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length;j++){
					if(arr[i]<arr[j]){
						int temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			
		}
			
}

class Demo3{
	public static void main(String[] args){
		int[] arr = {1,2,4,6,8,6};
		//ArrayTool tool = new ArrayTool();
		ArrayTool.sort(arr);//使用类名调用
		String info = ArrayTool.toString(arr);
		System.out.println("结果"+info);
		
		
	}
}





静态成员变量和非静态成员变量区别：
1.作用上的区别：
    静态成员的作用共享一个数据给所有的对象使用；
    非静态成员变量的作用是描述一类事物的公共属性；
2.数量与存储位置上的区别：
     静态成员是存储到方法区内存的，只会存在一份数据；
     非静态成员是存储在堆内存中，有n个对象就有n份数据；
3.生命周期：
    静态成员变量是随着类的加载而存在，随着类文件的消失而消失；
    非静态成员数据是随着对象的创建而存在，随着对象被垃圾回收器回收而消失。


main函数的详解：public static void main(String[] args)
public 公共的 ：权限是最大的，主方法是jvm调用的，要保证在任何情况下jvm都可以访问main函数。
static 静态：使jvm调用main函数时，使用类名就可以调用，不需要通过对象调用；
             （不使用static修饰，就需要创建对象调用，而jvm不知道如何创建对象。因为创建对象有些事需要参数的，参数传递什么东西呢？）
void  没有返回值：因为返回的数据给jvm，而jvm使用这个数据是没有意义的。（return时直接结束函数。）
main 函数名：不是关键字，是jvm能识别的特殊的函数名。
arguments 参数：数组类型的形参。 担心某些程序在启动的时候需要参数。 但是现在一般使用Scanner。














*/