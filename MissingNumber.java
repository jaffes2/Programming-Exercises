import java.util.*;

public class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        
        if(nums[0] != 0)
            return 0;
            
        if(nums.length == 1){
            
            if(nums[0] != 0)
                return 0;
                
            return 1;
        }
            
        int number = 0;
        for(int i = 0; i < nums.length -1; i++){
            
            if(nums[i] != (nums[i+1] -1)){
                return number+1;
            }
            
            number++;
        }
        
        if(number != 0)
            return nums.length;
        
        return number;
    }
}