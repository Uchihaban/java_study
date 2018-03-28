package day8;

import java.util.*;
public class Main{
public static String Pan(int length, int[] arr){
    Arrays.sort(arr);
    String Impossible = "Impossible";
    Boolean flag = true;
    int temp = arr[1]-arr[0];
    for(int i=0;i<length-1;i++){
        if(arr[i+1]-arr[i]!=temp){
            flag = false;
            break;
        }
    }
    if(flag){
         Impossible="Possible";
    }
         return Impossible;
 
}
public static void main(String[] args){
	
   
    Scanner sin=new Scanner(System.in);
   
    while(sin.hasNext()){
        int N = sin.nextInt(); 
        int[] arr = new int[N];
        for(int j = 0;j<N;j++){
            arr[j]=sin.nextInt();
        }
        String ff = Pan(N,arr);
        System.out.println(ff);
    }
    
}
}