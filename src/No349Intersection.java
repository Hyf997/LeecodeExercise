import java.util.HashSet;

/**
 * @author：Hyunfeng
 * @date：2020/11/2
 */
//给定两个数组，编写一个函数来计算它们的交集。
class No349Intersection{
    public static int[] intersection(int[] nums1, int[] nums2)
    {
        if(nums1.length>=nums2.length)
        {
            HashSet<Integer> integers1 = new HashSet<>(nums1.length);
            HashSet<Integer> integers2 = new HashSet<>(nums1.length);
            var result = new HashSet<Integer>();

            for (int i: nums1)
            {
                integers1.add(i);
            }
            for(int i:nums2)
            {
                integers2.add(i);
            }
            for (int i:integers1)
            {
                if (integers2.contains(i)) {
                    result.add(i);
                }
            }
            int index = 0;
            var ints = new int[result.size()];
            for(int i:result)
            {
                ints[index++]=i;
            }
            return ints;
        }
        else
            return intersection(nums2,nums1);

    }

    public static void main(String[] args) {
        var nums1 = new int[]{1,2,3,689};
        var nums2 = new int[]{1,4,5,3,65878,67,98,689,78,};
        int[] intersection = intersection(nums1, nums2);
        for(int i:intersection)
            System.out.println(i);
    }
}