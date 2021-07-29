package arrays;

import java.util.HashMap;

public class SumOfTwoInteger {

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            int complement = target-nums[i];

            if (map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No solution");
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};

        int sum[] = SumOfTwoInteger.twoSum(arr,9);
        for (int i=0;i<sum.length;i++){
            System.out.print(sum[i]);
        }
    }
}
