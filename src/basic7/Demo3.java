package basic7;


/*
 * 模拟卖票：
 * 
 * 线程安全问题：
 * 原因：1.存在两个或者两个以上的线程对象，而且线程之间共享着一个资源；
       2.有多个语句操作了共享资源；
                
 * 解决方法：
   1.sun提供了线程同步机制让我们解决这类问题；
   
   java线程同步机制：
                          方式一：同步代码块
                          synchronized("锁对象"){
                                                                             需要被同步的代码
                          }
                  1.任何一个对象都可以作为一个锁对象；凡是对象内部都维护了一个状态的，
                    java同步机制就是使用了对象中的状态作为了锁的标识；
                  2.同步代码块中调用了sleep方法并不是释放锁对象的；
                  3.只有真正存在线程安全问题的时候才能使用同步代码块，否则会降低效率；
                  4.多线程操作的锁对象必须是唯一共享的，static；
                  
                  
//  方式一：继承Thread类               
 class saleTickets extends Thread{
	
	Object o =new Object();
	
	static int tickets = 50;
	
	public saleTickets(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	public void run(){
		//同步代码块
		synchronized(o){//也可以用"锁对象"，""的字符串是不可变的;不可用 new String();
			
			while(tickets>0){
			System.out.println(Thread.currentThread().getName()+"卖了："+tickets+"张");
			tickets--;
		}
			
		if(tickets==0){
			System.out.println("卖完了");
		}
	}
 }
}
public class Demo3 {

	public static void main(String[] args){
		
		saleTickets Thread1 = new saleTickets("1");
		saleTickets Thread2 = new saleTickets("2");
		saleTickets Thread3 = new saleTickets("3");
		
		Thread1.start();
		Thread2.start();
		Thread3.start();
	}
}
                 
 //  方式二：使用Runnable接口.               
 class saleTickets implements Runnable{
	
	int count= 5000;//static 这里可以不加，因为saleTickets就只创建了一个对象；
	
	public void run(){
		
		while(true){
			synchronized("锁"){
				
			
			if(count>0){
				System.out.println("窗口"+Thread.currentThread().getName()+"卖出票第"+count+"票，还剩"+(count-1));
				count--;
			}else{
				System.out.println("买完了");
				break;
				}
			}
		}
	}
}
public class Demo1{
	public static void main(String[] args){
		 saleTickets s = new  saleTickets();
		 Thread thread1 = new Thread(s,"1号");
		 thread1.start();
		 Thread thread2 = new Thread(s,"2号");
		 thread2.start();
	}
}                 
                  
                  
                          方式二：同步函数
                                      使用 synchronized 修饰一个函数；
                                      
                  1.如果是一个非静态的同步函数，他的锁对象是this对象；
                                             如果是静态的同步函数，他的锁对象时当前函数所属的类的字节码文件（class对象）
                  2.同步函数的锁对象是固定的，不能由你指定；
                  
 class BankThread extends Thread{
	
	static int count =50000;
	
	public BankThread(String name){
		super(name);
	}
	
	public synchronized void run(){//同步函数 
	     getMoney();
		
	}
	//静态函数，锁对象是函数所属类的字节码文件new class()，BankThread.class
	public static synchronized void getMoney(){
	while(true){
			 
			if(count>0){
				System.out.println(Thread.currentThread().getName()+"取走了1000，还剩"+(count-1000));
			    count-=1000;
			}else{
				System.out.println("取完了");
				break;
			    }
		}
	 
		
}
public class Demo3 {
	public static void main(String[] args){
		BankThread b1 = new BankThread("老公");
		BankThread b2 = new BankThread("老婆");
		b1.start();
		b2.start();
	}
}
                 
            推荐使用同步代码块:锁对象可以由我们随意制定，方便控制；同步函数是固定的；
                                            同步代码块很方便控制需要被同步代码的范围；同步函数必须是整个函数的所有代码被同步了；
     
                   
 
 * java同步机制解决了线程安全问题，但是也引发了死锁现象：
 * 
 * 死锁根本原因：当多个线程完成功能需要同时获取多个共享资源的时候可能会导致死锁。
 * 解决方案：没有方案 ，只有避免；
 */
               
