package day5;

import day5.Outer.Inner;

/*
 * 内部类：一个类定义在另一个类的内部
 * 内部类的class文件名： 外部类$内部类   （便于区分该class文件是属于哪个外部类的）
 * 
 * 类别：
 *    成员内部类 :
 *            访问方式1：在外部类方法中创建内部类的对象，然后调用内部方法；
 *            访问方式2：在其他类直接创建内部类的对象； 格式：外部类.内部类  变量名 = new 外部类().new 内部类()
 *            
 *            注意：如果是一个静态内部类，那么在其他类创建的格式为：
 *                格式：外部类.内部类  变量名 = new 外部类.内部类()
 *                
 *            作用：内部类可以访问外部类的所有成员
 *            
 *            应用场景：描述A物的时候，如果发现A事物内部还存在另外一个比较复杂的事物B的时候，
 *                   而且B还需要访问A事物的属性等数据，那么我们就可以使用内部类描述B事物；
 *                   
 *            注意事项：1.如果外部类与内部类存在同名的成员变量时，在内部类中默认情况下访问内部类的成员变量；
 *                     可以通过"外部类.this.成员变量名  "指定访问外部类的成员
 *                   2.私有的成员内部类只能在外部类提供一个方法创建内部类的对象进行访问，不能再其他类创建对象了；
 *                   3.成员内部类一旦出现静态成员，那么该类也必须使用static修饰；
 *                     原因：Outer.class 文件被加载到内存的时候在内存中，静态的成员数据是不需要对象存在才能访问的。
 *                         Outer.Inner inner = new Outer().new Inner();
 *                         变成Outer.Inner inner = new Outer.Inner();
 *    
 *    局部内部类：
 *    
 *    
 *    //局部内部类  
		class Inner{
			
		}
 *    
 *    
 *     匿名内部类：
 *             简化书写
 *             使用前提：必须存在继承或者实现关系才能使用
 *     
 *     
 *     
 *     
 *     
 */
//外部类
class Outer{
	int  x = 100;
	//成员内部类  
	class Inner{
		int x = 200;
		int i = 10;
		public void print(){
			System.out.println("成员内部类的print方法"+Outer.this.x);
			//1.如果外部类与内部类存在同名的成员变量时，在内部类中默认情况下访问内部类的成员变量；
			//  可以通过"外部类.this.成员变量名 " 指定访问外部类的成员
		}
		
	}
	public void test(){//访问方式1：在外部类方法中创建内部类的对象，然后调用内部方法；
		Inner inner = new Inner();
		inner.print();
		System.out.println("外部类的test方法"+x);
	}
}
//其他类
public class Demo4 {
	public static void main(String[] args){
		/*Outer outer = new Outer();
		outer.test();*/   //访问方式1
		
		
		Outer.Inner inner = new Outer().new Inner();
		inner.print();
		//访问方式2：在其他类直接创建内部类的对象； 格式：外部类.内部类  变量名 = new 外部类().new 内部类()
		
		
	}
}
