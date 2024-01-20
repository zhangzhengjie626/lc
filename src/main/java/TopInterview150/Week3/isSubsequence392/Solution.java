package TopInterview150.Week3.isSubsequence392;

/**
 * 392.判断子序列
 */
public class Solution {
    public boolean isSubsequence(String s, String t) {
        int pointer = 0;
        for (int i = 0; i < s.length(); i++) {
            //还是写的简明易懂些吧
            pointer = existCurLetter(pointer, s.charAt(i), t);
            if(pointer == -1){ //相当于是中间就遇到不符合的，如果都符合但是t的长度没了，还是不对
                return false;
            } else{
                pointer++;
            }
        }
        return true;
    }

    //当前字符c是否存在在target[loc]开始的右边
    private int existCurLetter(int loc, char c, String target){
        int resLoc = -1;
        for (int i = loc; i < target.length(); i++) {
            if (target.charAt(i) == c) {
                resLoc = i;
                break;
            }
        }
        return resLoc;
    }
}
//寄1，忘记更新pointer位置了
//寄2：更新了，但是忘记pointer++了