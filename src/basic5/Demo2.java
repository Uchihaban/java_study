package basic5;
/*
 * 多态：一个对象具备多种形态。（父类的引用类型变量指向了子类的对象，
 *                      或者 接口的引用类型变量指向了接口实现类的对象）
 * 
 * 多态的前提：必须存在   继承  或者  实现  关系；
 * 
 *     动物  a = new 狗（）；
 *     
 *     
 *多要注意事项：
 *1.多态情况下，子父类存在同名的成员变量时（静态和非静态），访问的是父类的成员变量；
 *2.多态情况下，子父类存在同名的非静态成员函数时，访问的是子类的成员函数；
 *3.多态情况下，子父类存在同名的静态成员函数时，访问的是父类的成员函数；
 *
 *  总结：多态情况下，子父类存在同名的成员时，访问的都是父类的成员；只有在同名的非静态函数时，才是访问子类的。
 *4.多态情况下，不能访问子类特有的成员；
 * （编译看左边，运行不一定看右边；
     java编译器在编译时，会检查引用类型变量所属的类是否具备指定的成员，如果不具备马上编译报错）
 *
 *  
 * 多态的应用：
 * 1.多态用于形参类型的时候，可以接受更多类型的数据；
 * 2.多态用于返回值类型的时候，可以返回更多类型的数据；
 * 
 *多态的好处：提高了代码的拓展性；
 *  
 *  
 *  
 */

abstract class  MyShape{
	
	public abstract void getArea();
	
	public abstract void getLength();
	
}
class Cricle extends MyShape{
	
	public static final double PI = 3.14;
	
	double r;
	
	public Cricle(double r){
		this.r =r;
	}
	public void getArea(){
		System.out.println("圆的面积为"+PI*r*r);
	}
	public void getLength(){
		System.out.println("圆的周长为"+PI*r*2);
	}
	
}
class Rect extends MyShape{
	
	int len;
	
	int wid;
	
	public Rect(int len,int wid){
		this.len =len;
		this.wid=wid;
	}
	public void getArea(){
		System.out.println("矩形的面积为"+len*wid);
	}
	public void getLength(){
		System.out.println("矩形的周长为"+2*(len+wid));
	}
	
}


public class Demo2 {

	public static void main(String[] args){
		/*1.
		Cricle c = new Cricle(5.0);
		print(c);
		
		Rect r = new Rect(5,4);
		print(r);
		*/
		
		/*2.
		MyShape m = getShape(1); 调用了使用多态的方法，定义的变量类型要以返回值类型一致；
		m.getArea();
		m.getLength();
		*/
		
	}
	/*1.可以接受更多类型的数据；
	public static void print(MyShape m){
		m.getArea();
		m.getLength();
		
	}*/
	//2.可以返回任意类型的数据；
	public static MyShape getShape(int i ){
		if(i==0){
			return new Cricle(4.0);
		}
		else{
			return new Rect(4,5);
		}
	
 }
}
 
//实现关系下的多态：
/*接口  变量 = new 接口实现类的对象
 * 
 和继承关系下的多态相似，可将接口类当做父类；
 
interface Dao{ //接口的方法全部都是非静态的方法；多态情况下，子父类存在同名的非静态成员函数时，访问的是子类的成员函数；
	public void add();
	public void delte();
}

class UserDao implements Dao{
	
	 
	public void add() {
		 
		System.out.println("添加员工");
	}

	 
	public void delte() {
		 
		System.out.println("删除员工");
	}
}

class Demo2{
	public static void main(String[] args){
		Dao u = new UserDao();//接口的引用类型变量指向了接口实现类的对象
		u.add();
		u.delte();
	}

}
*/