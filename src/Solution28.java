/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution28
 * Author:   mac
 * Date:     2018/11/8 8:30 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.util.Arrays;

/**
 * 〈find-first-and-last-position-of-element-in-sorted-array〉<对应第34题>
 * 〈〉
 *
 * @author mac
 * @create 2018/11/8
 * @since 1.0.0
 */
public class Solution28 {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int start=-1;
        int end=-1;
        boolean flag = false;
        if(nums.length==1){
            if(nums[0]==target){
                ans[0]=0;
                ans[1]=0;
            }
        }
        else {
            for(int i=0;i<nums.length;i++){
                if(flag==false&&nums[i]==target){
                    ans[0]=i;
                    flag=true;
                }
                if(i==nums.length-1&&target==nums[i]){
                    ans[1]=i;
                }
                if(flag&&nums[i]!=target){
                    ans[1]=i;
                    flag=false;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[]nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
}

