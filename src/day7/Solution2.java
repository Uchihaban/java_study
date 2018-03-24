package day7;

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
    	str.append("We Are Happy");
    	System.out.println(s.replaceSpace(str));
    	
    }
}
