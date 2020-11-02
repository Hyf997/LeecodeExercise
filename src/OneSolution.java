import java.util.HashMap;
import java.util.Map;

/**
 * @author：Hyunfeng
 * @date：2020/11/1
 */
//两数之和
/*    给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
            你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
            示例:
            给定 nums = [2, 7, 11, 15], target = 9
            因为 nums[0] + nums[1] = 2 + 7 = 9
            所以返回 [0, 1]
            来源：力扣（LeetCode）
            链接：https://leetcode-cn.com/problems/two-sum
            著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
class OneSolution {
    //暴力解法
    public static int[] twoSum(int[] nums, int target) {
        var index = new int[2];
        int lenth = nums.length;
        for (int i = 0; i < lenth - 1; i++) {
            for (int j = i+1; j < lenth; j++) {
                if(nums[i]+nums[j]==target)
                {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return index;
    }

    //使用hash表
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        map.put(nums[0],0);
        for (int i = 1; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no result");
    }

    public static void main(String[] args) {
        int[] ints = {2, 7, 11, 15};
        int target = 26;
//        int[] ints1 = twoSum(ints, target);
//        System.out.println(ints1[0]);
//        System.out.println(ints1[1]);
        int[] ints1 = twoSum2(ints, target);
        System.out.println(ints1[0]);
        System.out.println(ints1[1]);
    }
}
