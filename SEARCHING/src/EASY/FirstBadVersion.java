//https://leetcode.com/problems/first-bad-version/description/
package EASY;
public class FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int firstBadVersion(int n) {
	        int start=1;
	        int end=n;
	        int mid=1;
	        while(start<end){
	            mid=start+(end-start)/2;
	            if(isBadVersion(mid)){
	                end= mid;
	            }else{
	                start=mid+1;
	            }
	        }
	        return start;
	    }
	 
	 
	 
	 //given method 
	 boolean isBadVersion(int version){
		 return true;  // or false
	 }

}
