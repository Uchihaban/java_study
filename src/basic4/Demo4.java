package basic4;
/*存在的问题：
 *1.动物类的run方法描述的不正确；
 *2.没有强制要子类一定重写方法；
 * 
 * 解决方案：描述一类事物的时候，发现该种事物确实存在着某种行为，但是
 * 这种行为目前是不具体的，那么我们可以抽取这种行为的声明，但是不去实
 * 现该种行为，这时候这种行为我们称作为抽象的行为，需要使用抽象类。
 * 
 * 
 * 抽象类的应用场景：描述一类事物的时候，发现该种事物确实存在着某种行为，
 * 但是这种行为目前是不具体的，那么我们可以抽取这种行为的声明，但是不去实
 * 现该种行为，这时候这种行为我们称作为抽象的行为，需要使用抽象类。
 * 
 * 抽象类的好处：强制子类一定要实现指定的方法；
 * 
 * 注意事项：
 * 1.如果一个函数没有方法体，那么函数必须要使用abstract修饰，把该函数修饰成抽象的函数；
 * 2.如果一个类出现了抽象的函数，那么该类也必须使用abstract修饰；
 * 3.如果一个非抽象类，继承了抽象类，那么必须要把抽象类的所有抽象方法全部实现；
 * 4.抽象类可以存在非抽象方法，也可以存在抽象方法；
 * 5.抽象类可以不存在抽象方法；
 * 6.抽象类是不能创建对象的；(因为抽象类是存在抽象方法的，如果能让抽象类创建对象的话，
 *                     那么使用抽象类的对象调用抽象方法是没有意义的）
 * 7.抽象类是存在构造函数的，其构造函数是提供给子类创建对象的时候初始化父类的属性的；
 * 
 * 
 * abstract不能与以下关键字共同修饰一个方法：
 *  1.不能与private共同修饰一个方法，private出了类就不可见了。 
 *  2.不能与static共同修饰一个方法；static表示可以直接用类名调用一个函数，但是此时这个函数是抽象函数。
 *  3.不能与final关键字共同修饰一个方法；final表示最终的方法，不能重写。
 *  
 */
//动物类---抽象类
abstract class Animal{//2
	String name;
	String color;
	
	public Animal(String name,String color){
		this.name=name;
		this.color=color;
	}
	
	public void eat(){
		System.out.println(color+name+"eating..");
	}//4
	
	//public void run(){
	//	System.out.println(color+name+"running...");
	//}这种行为目前是不具体的，那么我们可以抽取这种行为的声明，但是不去实现该种行为
	public abstract void run();//1.抽象类
}
class Dog extends Animal{
	public Dog(String name,String color){
		super(name,color);
	}
	public void run(){
		System.out.println(color+name+"running..");//3
	}
}
class Fish extends Animal{
	public Fish(String name,String color){
		super(name,color);
	}
	public void run(){
		System.out.println(color+name+"swimming..");//3
	}
}
public class Demo4 {
	public static void main(String[] args){
		Dog d = new Dog("萨摩耶","白");
        d.run();
        
        Fish f= new Fish("乌龟","黑");
        f.run();
	}
    
    
    
}
