package day7;

import java.util.Arrays;
/* 
 * Object类：
 * 
 * toString(); 返回对象的字符串表示；   完整类名+@+对象的哈希码(对象的内存地址）
 * equals(Object obj);默认的是比较两个对象的内存地址，判断两个对象是否是同一个对象；
 * hashCode();返回对象的哈希码；
 * 
 * 我们重写equals的时候，一般也会重写hashCode方法；
 * 
 * 
 * 
 * 查看源代码：
 *    1、按住crtl键，单击；
 *    2、F3；
 * 
 
 
public class Demo1 {
	int id;
	String name;
	
	public static void main(String[] args){
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		//==用于比较引用数据类型数据的时候，比较的是两个对象的内存地址；equals方法默认情况下也是比较的是两个对象的内存地址；
		//String类重写了object的equals方法，针对字符串，比较字符串的内容是否一致；
		//new String("hello")，会创建两个对象，一个在字符串常量池中，一个对象时位于堆内存中；
		
	}
}
*
*String构造方法：
1.String();创建一个空内容的字符串对象；
2.String(byte[] bytes);使用一个字节数组构建一个字符串对象； byte[] buf = {97,98,99};
3.String(byte[] bytes,int offset,int length);
          offset：指定从byte数组的哪个索引值开始解码;
4.String(char[] value);使用一个字符数组构建一个字符串，char[] arr = {'明'，'天'};
5.String(int[] codepoints,int offset,int length);
6.String(String original);用字符串构建一个字符串;

使用字节数组和字符数组都可以构造一个字符串对象;
*String获取方法：
int length()  获取字符串的长度
char charAt(int index) 获取特定位置的字符 (角标越界)
int indexOf(String str) 获取特定字符第一次出现的位置(overload)
int lastIndexOf(int ch/String str) 获取最后一个字符的位置


*String判断方法：
boolean endsWith(String str) 是否以指定字符结束
boolean isEmpty()是否长度为0 如：“” null     版本V1.6
boolean contains(CharSequences) 是否包含指定序列 应用：搜索
boolean equals(Object anObject) 是否相等
boolean equalsIgnoreCase(String anotherString) 忽略大小写是否相等

*String转换方法：
String(char[] value) 将字符数组转换为字符串
String(char[] value, int offset, int count)
Static String valueOf(char[] data)
static String valueOf(char[] data, int offset, int count)
char[] toCharArray()  将字符串转换为字符数组
byte[] getByte(); 将字节数组转换为字符数组

*String其他方法：
String replace(char oldChar, char newChar) 替换
String[] split(String regex) 切割
String substring(int beginIndex) 
String substring(int beginIndex, int endIndex)截取字串
String toUpperCase() 转大写
String toLowerCase() 转小写
String trim() 去除首位空格

*/

public class Demo1 {
	
	
	public static void main(String[] args){
		String str1 = "hello";
		String str2 = "    hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		
		char[] buf = str1.toCharArray();
		byte[] buf1=str1.getBytes();
		System.out.println(Arrays.toString(buf));
		System.out.println(Arrays.toString(buf1));
		//==用于比较引用数据类型数据的时候，比较的是两个对象的内存地址；equals方法默认情况下也是比较的是两个对象的内存地址；
		//String类重写了object的equals方法，针对字符串，比较字符串的内容是否一致；
		//new String("hello")，会创建两个对象，一个在字符串常量池中，一个对象时位于堆内存中；
		System.out.println(str2.trim());
	}
}