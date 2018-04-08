package basic3;
//	二维数组中的查找
public class Solution {
	public static boolean Find(int target, int [][] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int [][] arr = {{1,2},{2,3}};
        boolean s = Find(3,arr);
        System.out.println("答案是"+s);
    }
}
