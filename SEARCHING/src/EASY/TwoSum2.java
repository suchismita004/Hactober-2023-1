//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
package EASY;

public class TwoSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] twoSum(int[] numbers, int target) {
        int ans[]={-1,-1};
       int start=0;
       int end=numbers.length-1;
       while(start<=end){     
           int sum=numbers[start]+numbers[end];      
           if(target==sum){
               ans[0]=start+1;
               ans[1]=end+1;
               break;
           }
            if(target<sum){
                end--;
               }else{
                   start++;
               }                
       }
  return ans;
   }

}
