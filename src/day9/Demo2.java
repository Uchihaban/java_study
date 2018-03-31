package day9;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;


class Poker{
	
	String color;
	String num;
	
	public Poker(String color, String num){
		super();
		this.color=color;
		this.num=num;
	}
	
	public String toString(){
		return "{"+color+num+"}";
		
	}
}




public class Demo2 {

	
	public static void main(String[] args){
		LinkedList pokers = CreatPoker();
		System.out.println(pokers);
		System.out.println(pokers.size());
		xipai(pokers);
		System.out.println(pokers);
	}
	
	public static LinkedList CreatPoker(){
		LinkedList list = new LinkedList();
		
		String[] colors = {"梅花","方块","黑桃","红心"};
		String[] nums = {"A","1","2","3"};
		
		for(int i =0;i<colors.length;i++){
			for(int j =0;j<nums.length;j++){
				Poker p = new Poker(colors[i],nums[j]);
				list.add(p);
			}
		}
		
		return list;
	}
	
	public static void xipai(LinkedList p){
		
		Random random = new Random();
		
		for(int i =0;i<100;i++){
		int  index1 = random.nextInt(p.size());
		int  index2 = random.nextInt(p.size());
		
		Poker poker1 = (Poker) p.get(index1);
		Poker poker2 = (Poker) p.get(index2);
		
		p.set(index1, poker2);
		p.set(index2, poker1);

		
	}
	}	
}
