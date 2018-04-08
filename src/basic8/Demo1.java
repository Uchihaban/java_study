package basic8;

/*
 * 线程
 * 
 * wait()和notify()：
 * 1.是数据object类的；
 * 2.必须要在同步代码块中使用；
 * 3必须锁对象来调用；
 * 
wait：一个线程如果执行了wait，那么这个线程就会进入一个以锁对象为标识符的线程池中等待；
               告诉当前线程放弃执行权，并放弃监视器（锁）并进入阻塞状态，直到其他线程持有获得执行权，
             并持有了相同的监视器（锁）并调用notify为止。
notify：一个线程执行了notify，那么就会唤醒以锁对象为标识符的线程中等待线程的其中一个；
                唤醒持有同一个监视器（锁）中调用wait的第一个线程，例如，餐馆有空位置后，
                等候就餐最久的顾客最先入座。注意：被唤醒的线程是进入了可运行状态。等待cpu执行权。
notifyAll：唤醒持有同一监视器中调用wait的所有的线程。

 * 
 线程间通信其实就是多个线程在操作同一个资源，但操作动作不同，wait，notify（），notifyAll()都使用在同步中，
因为要对持有监视器（锁）的线程操作，所以要使用在同步中，因为只有同步才具有锁。

 * wait() 和 sleep()有什么区别？
wait():释放资源，释放锁。是Object的方法
sleep():释放资源，不释放锁。是Thread的方法
定义了notify为什么还要定义notifyAll，因为只用notify容易出现只唤醒本方线程情况，导致程序中的所有线程都在等待。

 
 * 线程的停止：
1.一般使用变量去控制；
2.如果要停止一个等待状态下的线程没我们就需要通过变量配合notify方法或者interrupt方法，interrupt方法是吧线程的等待状态
  强制清楚，被清除的线程会收到一个异常InterruptedException。


*后台线程(守护线程）：
就是隐藏起来一直在默默运行的线程，直到进程结束。如果一个进程只剩下了守护线程，那么守护线程也会死亡；
setDaemon(boolean on)默认不是守护线程，必须在启动线程之前（调用start方法之前）调用setDaemon（true）方法，
                                              才可以把该线程设置为后台线程
isDaenon()判断是否是守护线程


Thread的join方法：
当A线程执行到了B线程Join方法时A就会等待，等B线程都执行完A才会执行，Join可以用来临时加入线程执行
 */
class Product {

	String name;
	double price;

	boolean flag = false;//默认产品没有完成

}

class Producer extends Thread{

	 Product p;

	public Producer(Product p){
		this.p = p;
	}

	public void run(){
		int i = 0;

		while (true) {
			synchronized (p){
				if (p.flag == false) {//产品未生产，开始生产
					if (i % 2 == 0){
					p.name = "苹果";
					p.price = 6.5;
					
				} else {
					p.name = "梨子";
					p.price = 2;
					
				}
					System.out.println("生产" + p.name + "价格是" + p.price);
					p.flag = true;
					i++;
					p.notify();//唤醒消费者
			}else{
				//生产完毕
				try{
					p.wait();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	}
	}
}

class Customer extends Thread{

	Product p;

	public Customer(Product p) {
		this.p=p;
	}

	public void run() {
		while (true) {
			synchronized (p){	
			
				if(p.flag == true){//产品生产完毕，开始消费
					System.out.println("消费者买了" + p.name + "价格" + p.price);
					p.flag = false;
					p.notify();//唤醒生产者生产
				}else{//产品未生产，等待生产者生产
					try{
						p.wait();//消费者等待
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		}
	}
}

public  class Demo1{
	
	public static void main(String[] args) {

		Product p = new Product();
		Customer thread1 = new Customer(p);
		
		
		Producer thread2= new Producer(p);
		
		thread1.start();
		thread2.start();
		
		
	}
}