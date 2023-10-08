//https://leetcode.com/problems/valid-perfect-square/
package EASY;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isPerfectSquare(int num) {
        int start=0;
        int end=num;
        if(num==0 || num==1){
            return true;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if((long)mid*mid == (long)num ){
                return true;
            }
            if((long)mid*mid< (long)num){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }

}
