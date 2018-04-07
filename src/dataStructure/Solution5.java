package dataStructure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
public class Solution5 {
    public String PrintMinNumber(int [] numbers) {
    	
    	StringBuilder s = new StringBuilder();
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	
        if(numbers.length==0 || numbers ==null){
    		return s.toString();
    	}
        
    	//将数组放入arrayList中
    	 for (int i : numbers) {
             list.add(i);
         }
    	/*for(int i = 0;i<numbers.length;i++){
    		list.add(numbers[i]);
    	}*/
    
    	//实现了Comparator接口的compare方法，将集合元素按照compare方法的规则进行排序
    	Collections.sort(list,new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				String s1 = o1+""+o2;
				String s2 = o2+""+o1;
				return s1.compareTo(s2);
			}
    		
    	} );
    	
    	
    	for(Integer j : list){
    		s.append(j);
    	}
    	
		return s.toString();

    }
    
    public static void main(String[] args) {
    	Solution5 s = new Solution5();
    	int[] numbers = {};
    	System.out.println(s.PrintMinNumber(numbers));
	}
}