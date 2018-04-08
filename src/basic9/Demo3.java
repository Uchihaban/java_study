package basic9;

import java.util.HashSet;
import java.util.Scanner;

/*
 * 使用hashset 用户注册
 */
class Users{
	
	String userName;
	String password;
	
	public Users(String userName,String password){
		this.userName=userName;
		this.password=password;
	}
	
	public String toString(){
		return "{"+this.userName+this.password+"}";
	}
	
	public boolean equals(Object o){
		Users user = (Users)o;
		return this.userName.equals(user.userName)&&this.password.equals(user.password);
		
	}
	
	public int hashCode(){
		return userName.hashCode()+password.hashCode();
	}
}
public class Demo3 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		HashSet set = new HashSet();
		System.out.println("请输入用户名：");
		String userName = scanner.next();
		System.out.println("请输入密码：");
		String password = scanner.next();
		
		Users user = new Users(userName,password);
		if(set.add(user)){
			System.out.println("注册成功");
			System.out.println("当前用户"+set);
		}else{
			System.out.println("注册失败");
		}
	}
}
