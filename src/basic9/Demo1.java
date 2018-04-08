package basic9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/*
 * collection
 */
class User{
	int id;
	String password;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public User(int id, String password){
		this.id= id;
		this.password = password;
	}
	
	public boolean equals(Object obj){
		User user = (User)obj;
		return this.id==user.id;
	}
	
	public String toString(){
		return "{账号"+ this.id+"}";
	}
}
public class Demo1 {
	
	static Scanner scanner = new Scanner(System.in);
		
	static Collection users = new ArrayList();
			
	
	public static void main(String[] args){
		
		
		while(true){
			System.out.println("请选择功能  A注册  B登录");
			String option = scanner.next();
			
			if("A".equalsIgnoreCase(option)){
				login();
				}
			else if("B".equalsIgnoreCase(option)){
				log();
			}
			else{
				System.out.println("请重新输入");
			}
		}
	}

	
	
	public static void log() {
		System.out.println("请输入登录账号：");
		int id = scanner.nextInt();
		System.out.println("请输入密码：");
		String password = scanner.next();
		
		
		boolean isLogin = false;//定义变量默认没有成功
		Iterator it = users.iterator();
		while(it.hasNext()){
			User user = (User) it.next();
			if(user.id==id && user.password.equals(password)){
				isLogin = true;
			}
		}
		
		if(isLogin){
			System.out.println("登录成功");
		}
		else{
			System.out.println("登录失败");
		}
	}

	
	
	public static void login() {
		User user  = null;
		
		while(true){
			System.out.println("请输入注册账号：");
			int id =scanner.nextInt();
			//遍历集合是否存在该账号
			user  = new User(id,null);
			if(users.contains(user)){//底层依赖于equals
				System.out.println("账号已存在，请重新输入...");
			}else 
			{
				break;

			}
		}
		System.out.println("请输入密码：");
		String password = scanner.next();
		user.setPassword(password);
		
		users.add(user);
		System.out.println("注册成功");
		System.out.println("注册人数"+users.size()+users.toString());
	}
}
