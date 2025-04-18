class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenPtr = 0;
        int oddPtr = 1;
        
        while (oddPtr < nums.length && evenPtr < nums.length){
            if (evenPtr % 2 == 0 && nums[evenPtr] % 2 == 0){
                evenPtr += 2;
            }else if (oddPtr % 2 != 0 && nums[oddPtr] % 2 != 0){
                oddPtr += 2;
            }else{         
                int temp = nums[evenPtr];
                nums[evenPtr] = nums[oddPtr];
                nums[oddPtr] = temp;       
            }
        }
        return nums;
    }
}