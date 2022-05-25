package main;

import static jdk.nashorn.internal.objects.Global.println;

/**
 * 二分查找算法 278
 */
public class Efcz {

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int halfIndex = (end - start) / 2 + start;
            int halfValue = nums[halfIndex];
            if (halfValue == target) {
                return halfIndex;
            }
            if (halfValue < target) {
                start = halfIndex + 1;
            } else {
                end = halfIndex - 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] nums, int target, int start, int end) {
        int halfIndex = (end - start) / 2 + start;
        int halfValue = nums[halfIndex];
        int startValue = nums[start];
        int endValue = nums[end];
        if (target < startValue | target > endValue) {
            return -1;
        }

        if (target > halfValue) {
            start = halfIndex + 1;
        } else {
            end = halfIndex - 1;
        }
        return binarySearch(nums, target, start, end);
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 3;
        int value = search(nums, target);
        println(value);
    }

}
