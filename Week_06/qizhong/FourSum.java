package qizhong;

import java.util.*;


/**
 *
 *
 * 18. 四数之和
 * 题目描述:
 *      给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 *
 */
public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {


        List<List<Integer>> lists = new ArrayList<>();

        //1. 四数之和转三数之和
        //2. 三数之和转两数之和
        Map<String, Boolean> isCount = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int threeSum = target- nums[i]; // nums[i] 第1个值
            for (int j = i+1; j < nums.length; j++) {


                int twoSum = threeSum - nums[j]; // nums[j] 第2个值

                int[] restArr = Arrays.copyOfRange(nums,j+1,nums.length);
                List<int[]> idxsList = twoSum(restArr,twoSum); // 返回下标

                if(!idxsList.isEmpty()){
                    for (int[] idxs : idxsList) {
                        int third = nums[idxs[0]+j+1]; //third 第3个值
                        int forth = nums[idxs[1]+j+1]; //forth 第4个值

                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(third);
                        list.add(forth);

                        Collections.sort(list);

                        String key = list.toString();
                        if(isCount.containsKey(key)){
                            continue;
                        }
                        isCount.put(key, true);
                        lists.add(list);
                    }

                }

            }
        }
        return lists;

    }


    public List<int[]> twoSum(int[] nums, int target) {
        List<int[]> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(map.containsKey(difference) && map.get(difference)!=i) {
                list.add(new int[]{i, map.get(difference)});
            }
            map.put(nums[i], i);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2,3};
        List list = new FourSum().fourSum(nums, 0);
        System.out.println(list.toString());
    }

}
