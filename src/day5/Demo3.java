package day5;
/*
 * 目前在多态情况下不能访问子类特有的成员，如果需要访问子类的特有的成员，那么需要进行类型强制转换。
 * 
 * 基础强制类型转换：
 *      小数据类型---->大数据   自动类型转换
 *      大数据类型---->小数据   强制类型转换   小数据类型 变量名 = （小数据类型）大数据类型
 *      
 * 引用数据类型转换：
 *      小数据类型---->大数据类型   自动类型转换
 *      大数据类型---->小数据类型   强制类型转换   
 *      
 * Animal a = new Mouse("老鼠");
 * Mouse m = (Mouse)a;强制类型转换
 * m.dig();
 * 
 */
abstract class  MyShape1{
	
	public abstract void getArea();
	
	public abstract void getLength();
	
}
class Cricle1 extends MyShape1{
	
	public static final double PI = 3.14;
	
	double r;
	
	public Cricle1(double r){
		this.r =r;
	}
	public void getArea(){
		System.out.println("圆的面积为"+PI*r*r);
	}
	public void getLength(){
		System.out.println("圆的周长为"+PI*r*2);
	}
	public void dig1(){
		System.out.println("圆形的特有的方法");
	}
	
}
class Rect1 extends MyShape1{
	
	int len;
	
	int wid;
	
	public Rect1(int len,int wid){
		this.len =len;
		this.wid=wid;
	}
	public void getArea(){
		System.out.println("矩形的面积为"+len*wid);
	}
	public void getLength(){
		System.out.println("矩形的周长为"+2*(len+wid));
	}
	public void dig2(){
		System.out.println("矩形的特有的方法");
	}
	
}


public class Demo3 {

	public static void main(String[] args){
		
		Cricle1 c = new Cricle1(5.0);
		print(c);
		
		Rect1 r = new Rect1(5,4);
		print(r);
	
	}
	
	public static void print(MyShape1 m){
		if(m instanceof Cricle1){
			Cricle1 c =(Cricle1)m;//强制类型转换
			c.dig1();//圆形的特有的方法
			
		}else if(m instanceof Rect1){
			Rect1 r = (Rect1)m;//强制类型转换
			r.dig2();//矩形的特有的方法
		}
		m.getArea();
		m.getLength();
		
	}
	
}
