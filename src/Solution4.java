/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution4
 * Author:   mac
 * Date:     2018/10/12 10:48 PM
 * Description: 翻转数字
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */



/**
 * 〈reverse-integer〉<对应第七题>
 * 〈〉
 *
 * @author mac
 * @create 2018/10/12
 * @since 1.0.0
 */
public class Solution4 {
    public static int reverse(int x) {
        String str = ""+Math.abs(x);
        if(x>0){
            String temp="";
            for(int i=str.length()-1;i>=0;i--)
                temp = temp +str.charAt(i);
            if(temp.charAt(0)=='0')
                temp = temp.substring(1);
            return Integer.parseInt(temp);
        }
        if(x<0){
            String temp1="";
            for(int i=str.length()-1;i>=0;i--)
                temp1 = temp1 +str.charAt(i);
            if(temp1.charAt(0)=='0')
                temp1 = temp1.substring(1);
            temp1="-"+temp1;
            return Integer.parseInt(temp1);

        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println(reverse(1534236469));
    }
}

