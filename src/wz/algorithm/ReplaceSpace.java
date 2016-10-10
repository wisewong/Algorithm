package wz.algorithm;

/**
 * ReplaceSpace
 * 替换给定字符数组中的空格为指定的字符
 *
 * @author wz
 * @date 16/10/10 10:52
 */
public class ReplaceSpace {

    public void replaceSpace(char[] string,int length){
        int newLength = length;
        //得到新数组长度
        for (char c : string) {
            if (c == ' ') {
                newLength+=2;
            }
        }

        int originIndex = length-1,newIndex = newLength - 1;
        while (originIndex >= 0) {
            if (string[originIndex] == ' ') {
                string[newIndex--] = '0';
                string[newIndex--] = '2';
                string[newIndex--] = '%';
                originIndex--;
            }else {
                string[newIndex--] = string[originIndex--];
            }

        }
    }

}
