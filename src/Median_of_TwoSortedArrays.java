import java.util.Arrays;

public class Median_of_TwoSortedArrays {
    public static void main(String[] args) {

       int[] nums1 = {1,2}, nums2 = {3,4};

        System.out.println("findMedianSortedArrays() = " + findMedianSortedArrays(nums1,nums2));
        
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int [] arr = new int[nums1.length+nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            arr[i]=nums1[i];

        }
        for (int i = 0; i < nums2.length; i++) {
            arr[i+nums1.length]=nums2[i];

        }
        Arrays.sort(arr);

        if(arr.length%2!=0){
            System.out.println(Arrays.toString(arr));
            return (double) arr[(arr.length/2)];
        }else {

          return  (double) (arr[arr.length/2]+arr[(arr.length/2)-1])/2;

        }

    }
}
/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

 */