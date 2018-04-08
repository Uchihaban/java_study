package basic3;

/* 变量在同一个大括号内，可以直接访问；
 * 如果一个类要访问另外一个类变量时，那么这时候只能通过创建对象进行访问；
 */

/*成员变量与局部变量;
 * 1.定义的位置：成员变量是定义在方法之外，类之内；
 *           局部变量是定义在方法内； （一个函数的形式参数也是属于局部变量。）
 * 2.作用：成员变量的作用是用于描述一类事物的公共属性；
 *       局部变量的作用就是提供一个变量给方法内部使用而已；
 * 3.生命周期：成员变量随对象消失而消失；
 *          局部变量 在调用了对应的方法时执行到了创建该变量的语句时存在，局部变量一旦出了自己的作用域，那么马上从内存中消失；
 * 4.初始值：成员变量有初始值；
 *         局部变量没有默认初始值，必须要初始化才可以使用；
 */

/*匿名对象：没有引用类型变量指向的对象称作为匿名对象；
 * 注意事项：1.一般不会给匿名对象赋予属性值，因为永远无法获取到；
 *        2.new Student()==new Student() //"=="用于引用类型变量时，比较的是内存地址，判断两个对象是否为同一个对象；
 *          两个匿名对象永远都不可能是同一个对象；
 * 应用场景：如果一个对象需要调用一个方法一次的时候，调用完这个对象就不再使用，这时可以使用匿名对象；
 *        可以做为一个实参调用函数；//简化内存；
 */

/*封装:
 * 权限修饰符：权限修饰符就是控制变量可见范围的；
 * public：公共的，public修饰的成员变量或方法任何人都可以访问。
 * private：私有的，private修饰的成员变量或者方法只能在本类中进行直接访问。
 * 
 * 封装的步骤:
 * 1.使用private修饰需要被封装的属性；
 * 2.提供一个公共的方法设置或者获取该私有的成员属性；
 *   命名规范：set属性名（）；get属性名（）；
 *   //封装不一定要使用get或set。视需求而定，如果不允许访问，则不设置get方法。
 *   
 * 规范：在现实开发中，一般实体类的所有成员属性（成员变量）都要封装起来。
 *      实体类：就是用于描述一类事物的；
 *      工具类：例如Arrays为数组工具类；
 *      
 * 封装的好处：提高数据的安全性；操作简单；隐藏了实现；
 */ 


class Calculator{
	private int num1;
	private int num2;
	private char option;
	
	public void initCalculator(int n1, int n2, char o){
		num1=n1;
		num2=n2;
		option=o;
		
		if (o=='+'||o=='*'||o=='-'){
			option = o;
		}
		else {
			option = '+';
		}
	}
	
	public int calculate(){
		if(option=='+'){
			return num1+num2;
		}
		if(option=='*'){
			return num1*num2;
		}
		if(option=='-'){
			return num1-num2;
		}
		else{
			return -1;
		}
		
	}
}

class Demo1{
	public static void main(String[] args){
		Calculator c = new Calculator();
		c.initCalculator(3, 2, '-');
		c.calculate();
		System.out.println("答案是"+c.calculate());
	}
}
