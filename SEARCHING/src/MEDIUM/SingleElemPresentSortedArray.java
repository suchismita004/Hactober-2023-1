//https://leetcode.com/problems/single-element-in-a-sorted-array/description/
package MEDIUM;
public class SingleElemPresentSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start +(end -start) / 2;
             // for odd index to get even index
            if (mid % 2 == 1) { 
                mid--; 
            }
            if (nums[mid] != nums[mid + 1]) { 
     //If the middle element is not equal to its right neighbor,    
    //the single element must be on the LEFT side of the array 
                end = mid;
            } else {
      // otherwise single element on the RIGHT side  
                start = mid + 2;
            }
        }
        return nums[start]; // start and end point to single element
    }

}
