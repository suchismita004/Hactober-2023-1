package EASY;

//https://leetcode.com/problems/sqrtx/
public class SquareRoot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=mySqrt(2147395599);
		System.out.println(ans);
	}
	static int mySqrt(int x) {
	       if(x==0 || x==1){
	           return x;
	       }
	       int start=1;
	       int end=x;
	       int mid=0;
	      
	       while(start<=end){
	            mid=start+(end-start)/2;
	           if((long)x == (long)mid*mid){
	               return mid;
	           }
	           if((long)mid*mid > (long)x ){
	               end=mid-1;
	           }else{
	               start=mid+1;
	           }
	       }
	       return Math.round(end);
	    }

}
