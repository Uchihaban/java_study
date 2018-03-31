package day8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 数组：存储同一数据类型的集合容器；
 * 
 *     特点：只能存储同一数据类型的数据；
 *         一旦初始化，长度固定；
 *         数组中的元素与元素之间的内存地址是连续的；
 *     
 *     注意：object数组可以存储任意类型的数据；
 *   
 * 集合：是存储对象数据的容器
 * 
 * 集合可以存储任意类型的对象数据，数组只能存储同一种数据类型的数据；
 * 集合的长度是发生变化的，数组的长度是固定的；
 * 
 * 集合类collection可以被划分成两种，Set和List
 * 
 * collection  单例集合的根接口
 * ----------List 实现了List接口的集合类，具备的特点是有序可重复；
 * ----------set  实现了set接口的集合类，具备的特点是无序不可重复；
 * 
 * 
 *  collection  迭代的方法：
 *  ----toArray();
 *  ----iterator();
 *  迭代器的作用：抓取集合中的元素
 * 迭代器的方法：
 *           hashNext()   是否有元素可以遍历
 *           next()   获取元素
 *            void remove()  
 *            
 * No
 * 
 */
//class Person{
//	
//	String id;
//	String password;
//	
//	public Person(String id, String password){
//		this.id = id;
//		this.password = password;
//	}
//	
//	public void login(){
//		Collection s = new ArrayList();
//		if(id.contains(s.id)){
//			
//		}
//	}
//}
public class Demo2 {
	
	public static void main(String[] args){
		Collection c = new ArrayList();
		c.add("狗");
		
		//遍历集合的元素-----方式一：使用toArray
		Object[] arr = c.toArray();//把集合的元素存储到一个object的数组中返回
		for(int i = 0; i <arr.length;i++){
			System.out.print(arr[i]+",");
		}
		
		//使用iterator迭代器遍历
		Iterator it = c.iterator();//返回一个迭代器，iterator返回的实际上是接口的实现类
		while(it.hasNext()){
			System.out.println("元素"+it.next());
		}
		
	}
}
