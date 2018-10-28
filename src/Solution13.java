/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution13
 * Author:   mac
 * Date:     2018/10/23 10:11 PM
 * Description: 3sum-closest
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.util.Arrays;

/**
 * 〈3sum-closest〉<对应第16题>
 * 〈〉
 *
 * @author mac
 * @create 2018/10/23
 * @since 1.0.0
 */
public class Solution13 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int mid,right;
        if(nums.length < 3)
            return 0;
        int Min = nums[0]+nums[1]+nums[2];
        //left要循环全部
        for (int left = 0; left < nums.length-2; left++) {
            mid = left+1; right = nums.length-1;
            int tmp = target-nums[left];
            while(mid < right)
            {
                if(Math.abs(tmp - nums[mid] - nums[right]) <Math.abs(target - Min))  //每次查看是不是最小的情况
                    Min = nums[left]+ nums[mid] + nums[right];
                if(nums[mid] + nums[right] == tmp)
                {
                    return target;   //因为只有一种答案所以可以直接返回
                }
                else if(nums[mid] + nums[right] < tmp)
                    mid++;
                else
                    right--;
            }
        }
        return Min;
    }
}

