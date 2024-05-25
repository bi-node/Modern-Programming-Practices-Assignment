package easy;

import java.util.Arrays;


public class MergeArray {
    public static void main(String[] args) {
        int[] nums1 = {0, 3, 5, 8, 10, 0, 0, 0, 0};
        int[] nums2 = {1, 2, 7, 9};
        int m = 5, n = 4;
        mergeArray(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));


    }

    public static void mergeArray(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < m; i++) {
            if (nums1[i] > nums2[0]) {
                int temp = nums1[i];
                nums1[i] = nums2[0];
                nums2[0] = temp;
                int aux;
                for (int j = 0; j < n - 1; j++) {
                    if (nums2[j] < nums2[j + 1]) break;
                    else {
                        aux = nums2[j];
                        nums2[j] = nums2[j + 1];
                        nums2[j + 1] = aux;
                    }
                }

            }
        }
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }


    }


}
