/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution23
 * Author:   mac
 * Date:     2018/11/5 8:53 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈remove-element〉<对应第27题>
 * 〈〉
 *
 * @author mac
 * @create 2018/11/5
 * @since 1.0.0
 */
public class Solution23 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}

