package day7;
/*
 * 创建线程的方式：
 *    方式一：继承Thread类
 *          1.自定义一个类继承Thread类；
 *          2.重写Thread类的run方法，把自定义线程的任务代码写在run方法中；
 *            每个线程都有自己的任务代码，jvm创建的主线程任务代码就是main方法中的所有代码；
 *            自定义线程的任务代码就写在run方法中，自定义线程负责run方法中的代码；
 *          3.创建Thread的子类对象，并且调用start方法开启线程；
 *            一个线程一旦开启，那么线程就会执行run方法中的代码，run方法千万不能直接调用，
 *            调用了run方法相当于调用了一个普通的方法；
 *            
注意事项：         
1.	线程的启动使用父类的start()方法
2.	如果线程对象直接调用run()，那么JVN不会当作线程来运行，会认为是普通的方法调用。
3.	线程的启动只能由一次，否则抛出异常
4.	可以直接创建Thread类的对象并启动该线程，但是如果没有重写run()，什么也不执行。
5.	匿名内部类的线程实现方式
 
 * 线程的生命周期：
 创建：新创建了一个线程对象。
可运行：线程对象创建后，其他线程调用了该对象的start()方法。该状态的线程位于可运行线程池中，变得可运行，等待获取cpu的执行权。
运行：就绪状态的线程获取了CPU执行权，执行程序代码。
阻临时塞: 阻塞状态是线程因为某种原因放弃CPU使用权，暂时停止运行。直到线程进入就绪状态，才有机会转到运行状态。
死亡：线程执行完它的任务时。

 * 
 * 线程常用的方法：
 Thread(String name)     初始化线程的名字
 getName()             返回线程的名字
 setName(String name)    设置线程对象名
 sleep()                 线程睡眠指定的毫秒数。 
 
 currentThread()      返回CPU正在执行的线程的对象，当前线程对象，是一个静态的方法；哪一个
 
 getPriority()             返回当前线程对象的优先级   默认线程的优先级是5
 setPriority(int newPriority) 设置线程的优先级    虽然设置了线程的优先级，
                                                                   但是具体的实现取决于底层的操作系统的实现
                                                                   （最大的优先级是10 ，最小的1 ， 默认是5）。


 * 
 */
public class Demo2 extends Thread{
	public Demo2(String name){//调用Thread类一个参数的构造方法
		super(name);
	}

	public Demo2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("this:"+this);//this相当于this.toString();
		System.out.println("当前线程:"+Thread.currentThread());//与this相同
		
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("线程名字："+this.getName()+":"+i);
			try {
				Thread.sleep(100);//这里睡眠的是自定义线程；
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//不能抛出异常，只能捕获；因为父类Thread没有抛出异常，所以子类也不能抛出异常；
			}
		}
		
	}
	/*public static void main(String[] args){
		Demo2 d = new Demo2();
		d.start();
		for(int i=0;i<10;i++){
			System.out.println("main线程"+i);
		}
	}*/
	public static void main(String[] args) throws InterruptedException{
		Demo2 d = new Demo2("线1");
		d.setPriority(6);//优先级范围是1-10
		//Thread.sleep(1000);//这里睡眠的是主线程；
        //d.setName("线2");
		d.start();
		System.out.println("当前线程:"+Thread.currentThread());
		System.out.println("自定义线程优先级:"+d.getPriority());
		System.out.println("主线程优先级:"+Thread.currentThread().getPriority());
		for(int i=0;i<10;i++){
			System.out.println("main线程"+i);
		}
	}
}
