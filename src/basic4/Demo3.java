package basic4;
/*
 * final(最终、修饰符）
 * 用法：1.final关键字修饰一个基本类型的变量时，该变量不能重新赋值，第一次的值为最终的；声明的时候必须要初始化；
 *     2.final修饰一个引用类型的变量时，该变量不能重新指向新的变量；
 *     3.final修饰一个函数的时候，该函数不能被重写；
 *     4.final修饰一个类时，该类是不能被继承；
 *     
 *     常量修饰符：public static final 公共的，共享的，不能改变的 double pi=3.14
 


final class Cricle{// 4.final修饰一个类时
	double r;
	final double pi = 3.14;//1.final关键字修饰一个基本类型的变量时
	
	public Cricle(double r){
		this.r = r;
	}
	final public void getArea(){//3.final修饰一个函数的时候
		System.out.println("面积是"+pi*r*r);
	}
}

public class Demo3 extends Cricle{
	
    public Demo3(double r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
    
	public static void main(String[] agrs){
		//final Cricle c = new Cricle(5.0);//2.final修饰一个引用类型的变量时
    	//test(c);//传递的变量存储的值
		Demo3 c = new Demo3(4.0);
		c.getArea();
    }
	
    //public void getArea(){
    	System.out.println("hh");
    }
    
    public static void test(Cricle c){
        c = new Cricle(5.0);
        c.getArea();//不同的方法上面的局部变量时相互独立的，没有任何关系。
    }
}
*/