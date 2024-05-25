package easy;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 8, 9, 11, 13};
        RemoveDuplicate rd = new RemoveDuplicate();
        System.out.println(rd.searchInsert(nums, 10));

    }

    public int searchInsert(int[] nums, int target) {
        int mid = nums.length / 2;

        int lower = 0;
        int upper = nums.length - 1;
        if (nums[mid] == target)
            return mid;
        else if (target < nums[mid]) {
            upper = mid;
        } else {
            lower = mid;
        }

        int not = 0;
        System.out.println(lower + " " + upper);
        for (int i = lower; i <= upper; i++) {
            if (target == nums[i])
                return i;
            else if (target > nums[i]) {
                not = i + 1;
                System.out.println("None");
            }
        }

        return not;

    }
}
