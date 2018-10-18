/**
 * Copyright (C), 2016-2018, 李浩楠
 * FileName: Solution11
 * Author:   mac
 * Date:     2018/10/18 8:11 PM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈longest-common-prefix〉<对应第十四题>
 * 〈〉
 *
 * @author mac
 * @create 2018/10/18
 * @since 1.0.0
 */
public class Solution11 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String prefix =strs[0];
        for(int i=1;i<strs.length;i++){
            while (strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args){
        String[] strs ={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}

