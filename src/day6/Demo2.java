package day6;

/*自定义异常
 * 自定义一个类继承Exception即可
*/

class NoMoneyException extends Exception{
	 
	public NoMoneyException(String message){
		  super(message);
	  }
}

class Demo2 {
	public static void main(String[] args) throws NoMoneyException{
		eat(15);
	}
    public static void eat(int money) throws NoMoneyException{
    	if(money<10){
    		throw new NoMoneyException("钱不够");
    	}
    	System.out.println("吃饭啦");
    }
}
