/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution27
 * Author:   mac
 * Date:     2018/11/8 8:26 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.util.Arrays;

/**
 * 〈search-in-rotated-sorted-array〉<对应第33题>
 * 〈〉
 *
 * @author mac
 * @create 2018/11/8
 * @since 1.0.0
 */
public class Solution27 {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                return i;
        }
        return -1;
    }
}

