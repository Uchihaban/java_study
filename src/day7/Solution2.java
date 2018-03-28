package day7;
/*
 * 题目：替换空格
 *     请实现一个函数，将一个字符串中的空格替换成“%20”。
 *     例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution2{
    public String replaceSpace(StringBuffer str) {
       
    	int index = 0;
    	int start = 0;
    	while((index= str.indexOf(" ", start))!=-1){
            str.deleteCharAt(index);
    	    str.insert(index, "%20");
    	    start = index+1;
    	  }
    		return str.toString();
    	}
    
    public static void main(String[] args){
    	Solution2 s = new Solution2();
    	StringBuffer str = new  StringBuffer();
    	str.append("We Are Happy oh baby ");
    	System.out.println(s.replaceSpace(str));
    	
    }
}
