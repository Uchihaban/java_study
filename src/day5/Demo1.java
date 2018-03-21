package day5;
/*
 * 一个类最多只有一个直接的父类；但是有多个间接的父类；
 * 
 * java是单继承；多实现； 
 * 
 * 格式：interface 接口名{
 *                   }
 * 
 * 注意事项：1.接口是一个特殊的类；
 *        2.接口成员变量默认修饰符是 public static final
 *          也就是说接口中的成员变量都是常量；
 *        3.接口中的方法都是抽象的方法；默认修饰符为public abstract 
 *        4.接口不能创建对象；
 *        5.接口没有构造方法的；
 *        6.接口是给类去实现使用的，非抽象类实现一个接口的时候，必须要把接口中的所有方法全部实现；
 * 实现接口的形式：
 *    class 类名 implements 接口名{
 *    }
 * 
 * 接口的作用：
 * 1.程序的解耦；（重要）
 * 2.定义约束规范；
 * 3.拓展功能；
 * 
 * 类与接口的关系：实现关系
 *   1.非抽象类实现一个接口时，必须要把接口中的所有方法全部实现；
 *   2.抽象类实现一个接口时，可以实现也可以不实现接口中的方法（因为抽象类可以有抽象方法也可以有非抽象方法）；
 *   3.一个类可以实现多个接口；class Demo1 implements A,B 
 *     java是单继承；多实现； （因为接口中的方法都是抽象的，即使重名你，类也可以自定义这个方法）
 *   
 *  interface A{
	
	public static final int i = 10;
	
	public abstract void print();
	
}
class Demo1 implements A{
    
	public static void main(String[] args){
		Demo1 d = new Demo1();
		d.print();
	}
	
	public void print(){
		System.out.println("这个接口中的print方法");
	}
} 
 *   
 *   
 *   
 * 接口与接口之间的关系：继承关系
 *    一个接口可以继承多个接口；
 *    
 * 
 */
interface A{
	
	public void print();
	
}
interface B{
	
	public void get();
	
}
interface C extends A,B{
	
	public void test();
	
}
class Demo1 implements B{
    
	public static void main(String[] args){
		Demo1 d = new Demo1();
		d.print();
		d.test();
		d.get();
	}
	
	public void print(){
		System.out.println("这个接口中的print方法");
	}
	public void test(){
		System.out.println("这个接口中的test方法");
	}
	public void get(){
		System.out.println("这个接口中的get方法");
	}
	
}
