/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution8
 * Author:   mac
 * Date:     2018/10/15 9:31 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈container-with-most-water〉<对应第十一题>
 * 〈〉
 *
 * @author mac
 * @create 2018/10/15
 * @since 1.0.0
 */
public class Solution8 {
    public static int maxArea(int[] height) {
        int max = 0;
        int min=0;
        for(int i=0;i<height.length-1;i++) {
            for (int j = i + 1; j < height.length; j++){
                min = Math.min(height[i],height[j]);
                if((j-i)*min>max)
                    max = (j-i)*min;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] a={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));
    }
}

