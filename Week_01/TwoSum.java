/**
 方法: 暴力破解
 思路: 两层for循环
 复杂度分析:
     时间复杂度: O(n^2)
     空间复杂度: O(1)
*/	
class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] resultArr = new int[2];
        for (int i = 0; i< nums.length; i++) {
            for (int j = i +1; j<nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    resultArr[0] = i;
                    resultArr[1] = j;
                }
            }
        }
        return resultArr;
    }

}