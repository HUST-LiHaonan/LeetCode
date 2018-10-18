/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution12
 * Author:   mac
 * Date:     2018/10/18 8:32 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈3sum〉<对应第十五题>
 * 〈〉
 *
 * @author mac
 * @create 2018/10/18
 * @since 1.0.0
 */

import java.util.*;

public class Solution12 {
    public static List <List <Integer>> threeSum(int[] nums) {
        ArrayList <List <Integer>> L = new ArrayList <>();
        HashSet <List <Integer>> S = new HashSet <>();
        if (nums.length == 0) {
            return L;
        }
        Arrays.sort(nums);
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] > 0) {
                break;
            }
            int target = 0 - nums[k];
            int i = k+1;
            int j = nums.length - 1;
            while (i < j) {
                List <Integer> l1 = new LinkedList <>();
                if (target == (nums[i] + nums[j])) {
                    l1.add(nums[k]);
                    l1.add(nums[i]);
                    l1.add(nums[j]);
                    Collections.sort(l1);
                    S.add(l1);
                    while (i < j && nums[i] == nums[i + 1]) ++i;
                    while (i < j && nums[j] == nums[j - 1]) --j;
                    ++i; --j;
                }
                else if (nums[i] + nums[j] < target) ++i;
                else --j;
            }
        }
        for(List list:S)
            L.add(list);
        return L;
    }

    public static void main(String[] args){
        int[] nums ={-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}

