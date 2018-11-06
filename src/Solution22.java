/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution22
 * Author:   mac
 * Date:     2018/11/5 8:39 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


import java.util.HashSet;
import java.util.Set;

/**
 * 〈remove-duplicates-from-sorted-array〉<对应第26题>
 * <p>
 * 〈〉
 *
 * @author mac
 * @create 2018/11/5
 * @since 1.0.0
 */
public class Solution22 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2};
        System.out.println(removeDuplicates(a));
    }
}

