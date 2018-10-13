/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution1
 * Author:   mac
 * Date:     2018/10/12 10:17 PM
 * Description: median-of-two-sorted-arrays
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈求取中位数〉<对应第四题>
 * 〈median-of-two-sorted-arrays〉
 *
 * @author mac
 * @create 2018/10/12
 * @since 1.0.0
 */
public class Solution1 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 =new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=1;

        if(nums1.length==0){
            if(nums2.length%2==0){
                int a= nums2.length/2;
                int b= a-1;
                return (nums2[a]+nums2[b])/2;
            }

            else {
                return nums2[nums2.length/2];
            }
        }

        if(nums2.length==0){
            if(nums1.length%2==0){
                int a= nums1.length/2;
                int b= a-1;
                return (nums1[a]+nums1[b])/2;
            }

            else {
                return nums1[nums1.length/2];
            }
        }

        if(nums1[0]<=nums2[0]){
            nums3[0]=nums1[0];
            i=1;
        }
        else{
            nums3[0]=nums2[0];
            j=1;
        }

        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<=nums2[j]){
                nums3[k]=nums1[i];
                k++;
                i++;
            }
            else{
                nums3[k]=nums2[j];
                k++;
                j++;
            }
        }
        if(i==nums1.length&&j!=nums2.length){
            int t1 = i+j;
            for(int t2=j;t2<nums2.length;t2++,t1++) {
                nums3[t1] = nums2[t2];
            }
        }
        if(i!=nums1.length&&j==nums2.length) {
            int t1 = i+j;
            for(int t2=i;t2<nums1.length;t2++,t1++) {
                nums3[t1] = nums1[t2];
            }
        }
        if(nums3.length%2==0){
            int a= nums3.length/2;
            int b= a-1;

            return (double)(nums3[a]+nums3[b])/2;
        }
            
        else {
            return nums3[nums3.length/2];
        }
    }

    public static void main(String[] args){
        int[] a ={1,2};
        int[] b ={3,4};
        System.out.println(findMedianSortedArrays(a,b));
    }
}

