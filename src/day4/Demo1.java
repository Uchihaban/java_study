package day4;
/*
 * 模式：就是解决一类问题的固定步骤；
 * 
 * 单例设计模式
 * 模板设计模式
 * 装饰者设计模式
 * 观察者设计模式
 * 工厂设计模式
 * 
 * 单例设计模式：保证一个类在内存中只有一个对象
 * 
 * 饿汉单例设计模式：
 * 1.私有化构造函数；（防止别人new）
 * 2.声明本类的引用类型变量，并且使用该变量只想本类对象；
 * 3.提供一个公共静态的方法获取本类的对象；
 *
 *
 //饿汉单例设计模式：保证Single在内存中只有一个对象
class Single1{
	//声明本类的引用类型变量，并且使用该变量只想本类对象；
	private static Single s = new Single();
	//私有化构造函数
	private Single(){}
	//提供一个公共静态的方法获取本类的对象；
	public static Single getInstance(){
		return s;
	}
}
class Demo1 {
	public static void main(String[] args){
		Single1 s1 = Single1.getInstance();
		System.out.println(s1);
	}

}
 *
 *懒汉单例设计模式：
 *1.私有化构造函数；
 *2.声明本类的引用类型变量，但是不创建本类的对象；
 *3.提供一个公共静态的方法获取本类的对象；获取之前先判断是否已经创建了本类对象，
 *  如果已经创建了，那么直接返回对象，如果没有，先创建本类的对象，然后再返回。
 *
//懒汉单例设计模式：保证Single在内存中只有一个对象
class Single2{
	//声明本类的引用类型变量，但是不创建本类的对象；
	private static Single2 s;
	//私有化构造函数
	private Single(){}
	//提供一个公共静态的方法获取本类的对象；
	public static Single2 getInstance(){
	    if(s==null) {
	      s= new Single2();}
		return s;
	}
}
class Demo1 {
	public static void main(String[] args){
		Single s1 = Single.getInstance();
		System.out.println(s1);
	}

}


推荐使用饿汉单例模式，懒汉设计模式会存在线程安全问题。目前不能保证一类在内存中只有一个对象。
*/