//https://leetcode.com/problems/guess-number-higher-or-lower/description/

package EASY;
public class GuessPickedNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	static int guessNumber(int n) {
	      int start=1;
	      int end=n;
	      int mid=1;
	      while(start<=end){
	         mid=start+(end-start)/2; 
	        int num=guess(mid);
	      if(num == 0){
	          return mid;
	      } 
	      if(num == -1){
	          end=mid-1;
	      }else{
	          start=mid+1;
	      }
	      }
	      return mid;
	    }
	
//(given pre defined method )
	static int guess(int num){
		
		return num;
	}

}
